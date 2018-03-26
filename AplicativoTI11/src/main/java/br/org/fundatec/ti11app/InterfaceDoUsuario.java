package br.org.fundatec.ti11app;

import java.time.LocalDate;
import java.util.Scanner;

import br.org.fundatec.motorista.Motorista;
import br.org.fundatec.motorista.MotoristaService;
import br.org.fundatec.passageiro.Passageiro;
import br.org.fundatec.passageiro.PassageiroService;
import br.org.fundatec.viagem.Viagem;
import br.org.fundatec.viagem.ViagemService;

public class InterfaceDoUsuario {

    private MotoristaService motoristaService;
    private PassageiroService passageiroService;
    private ViagemService viagemService;
    private Scanner scanner;

    public InterfaceDoUsuario(MotoristaService motoristaService, PassageiroService passageiroService,ViagemService viagemService) {
        this.motoristaService = motoristaService;
        this.passageiroService = passageiroService;
        this.viagemService = viagemService;
        scanner = new Scanner(System.in);
    }

    public void iniciar() {
        boolean sair = true;
        while (sair) {
            System.out.println("Bem vindo!");
            System.out.println("Digite o numero para escolher a opção desejada");
            System.out.println("1 - adicionar passageiro");
            System.out.println("2 - adicionar motorista");
            System.out.println("3 - adicionar viagem");
            System.out.println("4 - calcular valor devido de um passageiro");
            System.out.println("5 - calcular valor que o motorista deve recebe");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    adicionarPassageiro();
                    break;
                case 2:
                    adicionarMotorista();
                    break;
                case 3:
                    adicionarViagem();
                    break;
                case 4:
                    calcularValorDevidoPeloPassageiro();
                    break;
                case 5:
                    calcularValorAReceberMotorista();
                    break;
                default:
                    System.out.println("opção não encontrada!");
                    sair = false;
                    break;
            }
        }
    }

    private void adicionarPassageiro() {
       System.out.println("Digite o nome do Passageiro: ");
       Passageiro passageiro = new Passageiro(scanner.next());
       System.out.println(passageiro.getNome() + " adicionado(a) ");
    }

    private void adicionarMotorista() {
        System.out.println("Digite o nome do motorista: ");
        String nome = scanner.next();
        motoristaService.adicionar(new Motorista(nome));
    }

    private void adicionarViagem() {
        // TODO chamar adição da viagem
        System.out.println("Digite o nome do passageiro");
        String nomePassageiro = scanner.next();

        System.out.println("Digite o nome do motorista");
        String motorista = scanner.next();

        System.out.println("Digite a quantidade de km rodados");
        Double kmrodados = scanner.nextDouble();

        System.out.println("Digite a quantidade de minutos");
        int quantidadeMinutos = scanner.nextInt();

        System.out.println("Digite a data");
        LocalDate date = formatDate(scanner.next());
        
        Viagem viagem = new Viagem(nomePassageiro, kmrodados, quantidadeMinutos, date);
		viagemService.adicionaViagem(viagem);
        
        Motorista mot = motoristaService.buscaMotoristaPeloNome(motorista);
        mot.getViagens().add(viagem);
        System.out.println("A viagem foi adicionada");
  


    }

private void calcularValorDevidoPeloPassageiro() {
        // TODO chamar calculo do valor devido de um passageiro
    	System.out.println("Informe o nome do passageiro");
    	String nomePassageiro = scanner.next();
    	Viagem viagem = viagemService.buscarPorNome(nomePassageiro);
    	double result = passageiroService.calcularValorDevidoPeloPassageiro(viagem);
		System.out.println(nomePassageiro + " deve: " + result);
	}
    	

    private void calcularValorAReceberMotorista() {
        System.out.println("Informe o nome do motorista:");
        String nomeMotorista = scanner.next();
        System.out.println("Informe a data inicio:");
        String dataInicio = scanner.next();
        //2018-03-21 <- formato data
        System.out.println("Informe a data de fim");
        String datafim = scanner.next();

        LocalDate inicio = formatDate(dataInicio);
        LocalDate fim = formatDate(datafim);
        System.out.println(inicio + " " + fim);
        double result = motoristaService.calcularValorMotoristaRecebe(nomeMotorista, inicio, fim);
        System.out.println("O motorista deve receber: " + result);
    }

    private LocalDate formatDate(String dataText) {
        return LocalDate.parse(dataText);
    }
}