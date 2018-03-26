package br.fundatec.motorista;
import java.util.List;

import br.fundatec.passageiro.Passageiro;

public class Motorista {
	private String nome;
	private List <Passageiro> passageiros;
	
	public Motorista(String nome, List<Passageiro> passageiros) {
		this.nome = nome;
		this.passageiros = passageiros;
	}
	public String getNome() {
		return nome;
	}

	public List<Passageiro> getPassageiros() {
		return passageiros;
	}
	public void setPassageiros(List<Passageiro> passageiros) {
		this.passageiros = passageiros;
	}
	
	

}
