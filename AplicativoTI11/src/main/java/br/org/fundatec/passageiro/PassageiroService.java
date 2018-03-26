package br.org.fundatec.passageiro;

import br.org.fundatec.calculadora.CalculadoraValores;
import br.org.fundatec.viagem.Viagem;

public class PassageiroService {
	private PassageiroDao passageiroDao;
	private CalculadoraValores calculadoraValores;

	public PassageiroService(PassageiroDao passageiroDao, CalculadoraValores calculadoraValores) {
		this.passageiroDao = passageiroDao;
		this.calculadoraValores = calculadoraValores;
	}

	public double calcularValorDevidoPeloPassageiro(Viagem viagem) {
		return calculadoraValores.calcularValorDevidoPeloPassageiro(viagem);
                
    }
	public Passageiro buscarPassageiroPeloNome(String nome) {
		return passageiroDao.buscarPorNome(nome).get();
	}

	 public void adicionar(Passageiro passageiro) {
	        if (passageiroDao.buscarPorNome(passageiro.getNome()).isPresent()) {
	            System.out.println("nome " + passageiro.getNome() + " já! existe!");
	            return;
	        }
	        passageiroDao.adicionar(passageiro);
	    }

}
