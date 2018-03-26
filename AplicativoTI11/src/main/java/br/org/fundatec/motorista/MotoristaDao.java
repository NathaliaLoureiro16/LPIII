package br.org.fundatec.motorista;

import java.util.Optional;

public interface MotoristaDao {
    Optional<Motorista> buscarPorNome(String nome);
    void adicionar(Motorista motorista);
}
