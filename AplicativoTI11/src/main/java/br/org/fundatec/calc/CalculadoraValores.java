package br.org.fundatec.calc;

import java.time.LocalDate;

import br.org.fundatec.motorista.Motorista;
import br.org.fundatec.passageiro.Passageiro;
import br.org.fundatec.viagem.Viagem;

public interface CalculadoraValores {
    // calcula valor que o motorista ira receber
	Double calcularValorMotoristaRecebe(Motorista motorista, LocalDate dataViagemInicio, LocalDate dataViagemFim);

    // calcula o valor devido pelo passageiro
    Double calcularValorDevidoPeloPassageiro(Viagem viagem);

	

}
