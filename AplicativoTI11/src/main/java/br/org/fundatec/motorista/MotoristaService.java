package br.org.fundatec.motorista;

import java.time.LocalDate;

import br.org.fundatec.calculadora.CalculadoraValores;
import br.org.fundatec.passageiro.Passageiro;
import br.org.fundatec.viagem.Viagem;

public class MotoristaService {

	private MotoristaDao motoristaDao;
	private CalculadoraValores calculadoraValores;

	public MotoristaService(MotoristaDao motoristaDao, CalculadoraValores calculadoraValores) {
		this.motoristaDao = motoristaDao;
		this.calculadoraValores = calculadoraValores;
	}

	public Motorista buscaMotoristaPeloNome(String motorista) {
		return motoristaDao.buscarPorNome(motorista).get();
	}

	public double calcularValorMotoristaRecebe(String nome, LocalDate inicio, LocalDate fim) {
		return motoristaDao.buscarPorNome(nome)
				.map(motorista -> calculadoraValores.calcularValorMotoristaRecebe(motorista, inicio, fim))
				.orElse(0.0);
	}

	public void adicionar(Motorista motorista) {
		if (motoristaDao.buscarPorNome(motorista.getNome()).isPresent()) {
			System.out.println("nome " + motorista.getNome() + " já existe!");
			return;
		}
		motoristaDao.adicionar(motorista);
	}
}