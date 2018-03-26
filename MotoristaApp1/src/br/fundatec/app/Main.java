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
		List<Passageiro> passageiros = Arrays.asList
				(new Passageiro("João", 6.7, 17, LocalDate.of(2018, 03, 15)) ,
				(new Passageiro("Pedro", 3.1, 11, LocalDate.of(2018, 03, 11))),
				(new Passageiro("Maria", 3.0, 34, LocalDate.of(2018, 03, 14))));
		
		Motorista motora = new Motorista("motora", passageiros);
		CalculadoraCorrida calc = new CalculadoraCorrida();
		double valFinal = calc.calcularValorFinal(motora,LocalDate.of(2018, 03, 11), LocalDate.of(2018, 03, 12));
		
		System.out.println("O motorista vai receber" + valFinal);
		//passageiros.sort(Comparator.comparing(Passageiro::getData, Comparator.nullsLast(LocalDate::compareTo)));
		//passageiros.forEach(System.out::println);
	}
}
