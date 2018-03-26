package br.org.fundatec.viagem;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class ViagemDaoNaMemoria implements ViagemDao {

	private List<Viagem> viagens;

	public ViagemDaoNaMemoria() {
		this.viagens = new ArrayList<>();
	}

	@Override
	public void adiciona(Viagem viagem) {
		this.viagens.add(viagem);
		
	}

	@Override
	public Optional<Viagem> buscarPorNome(String nome) {
		return viagens.stream()
				.filter(viagem -> viagem.getNomePassageiro().equals(nome))
				.findFirst();
	}
}

