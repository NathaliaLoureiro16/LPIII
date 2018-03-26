package br.org.fundatec.passageiro;

import java.util.Optional;

public interface PassageiroDao {
	 Optional<Passageiro> buscarPorNome(String nome);
	    void adicionar(Passageiro passageiro);
}
