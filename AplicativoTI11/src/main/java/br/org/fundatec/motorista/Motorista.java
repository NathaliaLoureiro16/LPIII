package br.org.fundatec.motorista;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import br.org.fundatec.viagem.Viagem;

public class Motorista {
	private String nome;
	private List<Viagem> viagens;

	public Motorista(String nome) {
		this.nome = nome;
		this.viagens = new ArrayList<>();
	}

	public Motorista(String nome, List<Viagem> viagens) {
		this.nome = nome;
		this.viagens = viagens;
	}
	
	public String getNome() {
		return nome;
	}
	public List<Viagem> getViagens() {
		return viagens;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Motorista motorista = (Motorista) o;
		return Objects.equals(nome, motorista.nome) &&
				Objects.equals(viagens, motorista.viagens);
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome, viagens);
	}

	@Override
	public String toString() {
		return "Motorista{" +
				"nome='" + nome + '\'' +
				", viagens=" + viagens +
				'}';
	}
}
