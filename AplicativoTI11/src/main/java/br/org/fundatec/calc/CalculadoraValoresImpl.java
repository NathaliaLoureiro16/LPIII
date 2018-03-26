package br.org.fundatec.calc;

import java.time.LocalDate;

import br.org.fundatec.motorista.Motorista;
import br.org.fundatec.passageiro.Passageiro;
import br.org.fundatec.viagem.Viagem;

public class CalculadoraValoresImpl implements CalculadoraValores {

	// calcula valor que o motorista ira receber
	@Override
	public Double calcularValorMotoristaRecebe(Motorista motorista,LocalDate dataViagemInicio, LocalDate dataViagemFim) {
		double valorCorrida = 0;
		for (Viagem Viagem : motorista.getViagens()) {
			if (Viagem.getDataViagem().compareTo(dataViagemInicio) >= 0
					&& Viagem.getDataViagem().compareTo(dataViagemFim) <= 0) {
				valorCorrida += (Viagem.getQuantidadeMinutos() * 0.50) + (Viagem.getKmRodado() * 0.20);
			}
		}
		return valorCorrida;
	}

	@Override
	public Double calcularValorDevidoPeloPassageiro(Viagem viagem) {
		double resultado = viagem.getQuantidadeMinutos() * 0.50 + viagem.getKmRodado() * 0.20;
		return resultado + (resultado* 0.15) ;
	}


	
}
