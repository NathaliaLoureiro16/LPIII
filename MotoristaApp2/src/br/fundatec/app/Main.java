package br.fundatec.app;


import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import br.fundatec.calculadora.CalculadoraCorrida;
import br.fundatec.motorista.Motorista;
import br.fundatec.passageiro.Passageiro;


public class Main {

	public static void main(String[] args) {
		List<Passageiro> passageiros = Arrays.asList(
				new Passageiro("João", 6.7, 17, LocalDate.of(2018, 03, 11)),
				new Passageiro("Pedro", 3.1, 11, LocalDate.of(2018, 03, 12)),
				new Passageiro("Maria", 3.0, 34, LocalDate.of(2018, 03, 13))
		);
		
		Motorista motora = new Motorista("motora", passageiros);
		CalculadoraCorrida calc = new CalculadoraCorrida();
		double valFinal = calc.calcularValorFinal(motora,LocalDate.of(2018, 03, 11), LocalDate.of(2018, 03, 13));
		
		for (Passageiro passageiro : passageiros) {
			System.out.println("Valor devido pelo passageiro " + passageiro.getNome() + " : " + calc.calcularValorDevido(passageiro) + " e a data da corrida foi " + passageiro.getData());
		} 
		System.out.println("E o motorista vai receber " + valFinal + " reais");
		
	}
}
