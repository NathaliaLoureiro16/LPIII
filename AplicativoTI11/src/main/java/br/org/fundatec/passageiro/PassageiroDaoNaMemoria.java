package br.org.fundatec.passageiro;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import br.org.fundatec.motorista.Motorista;

public class PassageiroDaoNaMemoria implements PassageiroDao{
	private List<Passageiro> passageiros;
	
	public PassageiroDaoNaMemoria() {
        passageiros = new ArrayList<>();
	}

	@Override
	public Optional<Passageiro> buscarPorNome(String nome) {
		return passageiros.stream()
				.filter(passageiro -> passageiro.getNome().equals(nome))
				.findFirst();
	}

	@Override
	public void adicionar(Passageiro passageiro) {
		passageiros.add(passageiro);
		System.out.println(passageiros);
		
	}

}
