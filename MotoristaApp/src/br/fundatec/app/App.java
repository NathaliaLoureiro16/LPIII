package br.fundatec.app;

import java.time.Month;
import java.util.Arrays;
import java.util.List;

import br.fundatec.calc.CalculadoraCorridas;
import br.fundatec.motorista.Motorista;
import br.fundatec.passageiro.Passageiro;

public class App {
	public static void main(String[] args) {
		Passageiro joao = new Passageiro("João", 6.7, 17);
		Passageiro pedro = new Passageiro("Pedro", 3.1, 11);
		Passageiro maria = new Passageiro("Maria", 3.0, 34);

		List<Passageiro> passageiros = Arrays.asList(joao, pedro, maria);
		
		Motorista motora = new Motorista("caio", passageiros);
		CalculadoraCorridas calc = new CalculadoraCorridas();
		double valFinal = calc.calcularValorFinal(motora);
		
		System.out.println("O motorista deve receber " + valFinal);
	}
}
