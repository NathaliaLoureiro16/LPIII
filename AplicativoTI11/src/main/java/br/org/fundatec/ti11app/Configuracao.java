package br.org.fundatec.ti11app;

import br.org.fundatec.calc.CalculadoraValoresImpl;
import br.org.fundatec.motorista.MotoristaDaoNaMemoria;
import br.org.fundatec.motorista.MotoristaService;
import br.org.fundatec.passageiro.PassageiroDaoNaMemoria;
import br.org.fundatec.passageiro.PassageiroService;
import br.org.fundatec.viagem.ViagemDaoNaMemoria;
import br.org.fundatec.viagem.ViagemService;

public class Configuracao {
    public static InterfaceDoUsuario getUI() {
        return new InterfaceDoUsuario(new MotoristaService(new MotoristaDaoNaMemoria(), new CalculadoraValoresImpl()), new PassageiroService(new PassageiroDaoNaMemoria(), new CalculadoraValoresImpl()),
        		new ViagemService(new ViagemDaoNaMemoria()));

    }
  
}