package br.fundatec.funcionariohora;

import java.util.Scanner;

import br.fundatec.funcionariohora.negocio.Calculadora;

public class app {
	
public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	
	System.out.println("Escreva o nome do Funcionario");
	String nome = teclado.nextLine();
	System.out.println("digite a hora total trabalhada");
	int horaTrabalhada = teclado.nextInt();
	
	Calculadora calc = new Calculadora();
	try {
		double total = calc.calcular(nome,horaTrabalhada);
		System.out.println(nome + " Trabalhou " + horaTrabalhada + " e recebeu " + total);
	} catch (IllegalArgumentException e) {
			System.out.println("Nome invalido");
	}
	
 }
}
