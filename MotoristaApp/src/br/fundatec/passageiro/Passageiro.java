package br.fundatec.passageiro;

public class Passageiro {
	private String nome;
	private double kmRodado;
	private int qtdMin;
	
	public Passageiro(String nome, double kmRodado, int qtdMin) {
		this.nome = nome;
		this.kmRodado = kmRodado;
		this.qtdMin = qtdMin;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getKmRodado() {
		return kmRodado;
	}
	public void setKmRodado(double kmRodado) {
		this.kmRodado = kmRodado;
	}
	public int getQtdMin() {
		return qtdMin;
	}
	public void setQtdMin(int qtdMin) {
		this.qtdMin = qtdMin;
	}
	

}
