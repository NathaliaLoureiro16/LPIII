package br.fundatec.passageiro;

import java.time.LocalDate;

public class Passageiro {
	private String nome;
	private double kmRodado;
	private int qtdMin;
	private LocalDate data;
	

	public Passageiro(String nome, double kmRodado, int qtdMin, LocalDate data) {
		this.nome = nome;
		this.kmRodado = kmRodado;
		this.qtdMin = qtdMin;
		this.data = data;
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

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

}

