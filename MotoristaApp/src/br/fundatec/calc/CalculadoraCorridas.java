package br.fundatec.calc;

import java.util.List;

import br.fundatec.motorista.Motorista;
import br.fundatec.passageiro.Passageiro;

public class CalculadoraCorridas {

	public double calcularValorFinal(Motorista motorista) {
		List <Passageiro> passageiros = motorista.getPassageiros();
		double valFinal = 0;
		for (Passageiro passageiro : passageiros) {
			valFinal += passageiro.getQtdMin() * 0.50 + passageiro.getKmRodado() * 0.20;
		}
		return valFinal;
		
	}
}
//qtdMin * valorMin + qtdKM * valorKM