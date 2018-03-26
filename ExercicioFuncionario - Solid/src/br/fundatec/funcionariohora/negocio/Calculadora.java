package br.fundatec.funcionariohora.negocio;

import java.util.List;

import br.fundatec.funcionariohora.Funcionario;
import br.fundatec.funcionariohora.banco.Banco;

public class Calculadora {

	public double calcular(String nome, int horaTrabalhada) {
		Banco banco = new Banco();
		List<Funcionario>funcionarios = banco.getFuncionarios();
		for (Funcionario funcionario : funcionarios) {
			if(funcionario.getNome().equals(nome)) {
				double valorHora = funcionario.getSalario()/180;
				int horaExtra = horaTrabalhada - 180;
				double total = funcionario.getSalario() + (valorHora * horaExtra * 1.5);
				return total;
			}
		}
		throw new IllegalArgumentException();
		
	}

}
