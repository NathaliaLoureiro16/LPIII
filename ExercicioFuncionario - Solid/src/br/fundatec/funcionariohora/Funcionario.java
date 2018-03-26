package br.fundatec.funcionariohora;

public class Funcionario {
	private String nome;
	private double salario;
	private String cargo;

	public Funcionario(String nome, double salario, String cargo) {
		this.nome = nome;
		this.salario = salario;
		this.cargo = cargo;
	}

	public String getNome() {
		return nome;
	}

	public double getSalario() {
		return salario;
	}

	public String getCargo() {
		return cargo;
	}

}
