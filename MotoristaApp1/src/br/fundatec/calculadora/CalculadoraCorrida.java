package br.fundatec.calculadora;
import java.time.LocalDate;
import java.util.List;

import br.fundatec.motorista.Motorista;
import br.fundatec.passageiro.Passageiro;


public class CalculadoraCorrida {
	
/*	public double calcularValorFinal(Viagem viagem) {
		List <Passageiro> passageiros = viagem.getPassageiros();
		double valFinal = 0;
		for (Passageiro passageiro : passageiros) {
			valFinal += viagem.getQtdMin() * 0.50 + viagem.getkmRodado() * 0.20;
		}
		return valFinal;
		
	}*/

	public double calcularValorFinal(Motorista motorista, LocalDate dataInicial,  LocalDate dataFinal){
		List <Passageiro> passageiros = motorista.getPassageiros();
		double valFinal = 0;
		for(Passageiro passageiro: motorista.getPassageiros()){
			valFinal+= passageiro.getQtdMin() * 0.50 + passageiro.getKmRodado() * 0.20;
		if(passageiro.getData().isAfter(dataInicial) && passageiro.getData().isBefore(dataFinal)) {
			 
			}
		}
		return valFinal;
	}
}


