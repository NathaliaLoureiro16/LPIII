package br.org.fundatec.viagem;

import java.time.LocalDate;
import java.util.Objects;

public class Viagem {

	private String nomePassageiro;
	private double kmRodado;
	private int quantidadeMinutos;
	private LocalDate dataViagem;

	public Viagem(String nomePassageiro, double kmRodado, int quantidadeMinutos, LocalDate dataViagem) {
		this.nomePassageiro = nomePassageiro;
		this.kmRodado = kmRodado;
		this.quantidadeMinutos = quantidadeMinutos;
		this.dataViagem = dataViagem;
	}

	public LocalDate getDataViagem() {
		return dataViagem;
	}

	public String getNomePassageiro() {
		return nomePassageiro;
	}

	public double getKmRodado() {
		return kmRodado;
	}

	public int getQuantidadeMinutos() {
		return quantidadeMinutos;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Viagem that = (Viagem) o;
		return Double.compare(that.kmRodado, kmRodado) == 0 &&
				quantidadeMinutos == that.quantidadeMinutos &&
				Objects.equals(nomePassageiro, that.nomePassageiro) &&
				Objects.equals(dataViagem, that.dataViagem);
	}

	@Override
	public int hashCode() {
		return Objects.hash(nomePassageiro, kmRodado, quantidadeMinutos, dataViagem);
	}
}
