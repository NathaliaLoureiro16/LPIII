package br.org.fundatec.viagem;

public class ViagemService {
	private ViagemDao viagemDao;

	public ViagemService(ViagemDao viagemDao) {
		this.viagemDao = viagemDao;
	}
	
	public void adicionaViagem(Viagem viagem) {
		viagemDao.adiciona(viagem);
	}
	public Viagem buscarPorNome(String nomePassageiro) {
		return viagemDao.buscarPorNome(nomePassageiro).get();
	}
}