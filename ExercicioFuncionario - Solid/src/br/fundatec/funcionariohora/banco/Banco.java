package br.fundatec.funcionariohora.banco;

import java.util.Arrays;
import java.util.List;

import br.fundatec.funcionariohora.Funcionario;

public class Banco {
	private List<Funcionario> funcionarios = Arrays.asList(
			new Funcionario("Joaozinho", 1000.0, "operador"),
			new Funcionario("Pedrinho", 1000.0, "operador"),
			new Funcionario("Mariazinha", 2000.0, "gerente"));
	
	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}

}
