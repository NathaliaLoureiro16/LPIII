package br.org.fundatec.viagem;

import java.util.Optional;

public interface ViagemDao {
	Optional<Viagem> buscarPorNome(String nome);
	void adiciona(Viagem viagem);
	
}

