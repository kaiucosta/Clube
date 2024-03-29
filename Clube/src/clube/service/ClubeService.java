package clube.service;

import java.util.List;

import clube.bo.AssociadoBO;
import clube.bo.AssociadoVideogameBO;
import clube.bo.AssociadoVideogameJogoBO;
import clube.bo.EmprestimoBO;
import clube.bo.VideogameBO;
import clube.model.Associado;
import clube.model.AssociadoVideogameJogo;
import clube.model.Emprestimo;
import clube.model.Videogame;

public class ClubeService implements IClubeService {

	private static final long serialVersionUID = 8751380378503694270L;

	/***
	 * Singleton pattern
	 */
	private static ClubeService instance;

	private ClubeService() {
	}

	public static ClubeService getInstance() {
		if (instance == null) {
			synchronized (ClubeService.class) {
				if (instance == null) {
					instance = new ClubeService();
				}
			}
		}
		return instance;
	}

	@Override
	public void emprestimo() {
		// TODO Auto-generated method stub
	}

	@Override
	public void devolucao() {
		// TODO Auto-generated method stub

	}

	@Override
	public Associado encontrarAssociadoPorId_fullList(Long id) {
		AssociadoBO bo = new AssociadoBO();
		return bo.encontrarPorId_FullList(id);
	}

	@Override
	public void salvarAssociado(Associado associado) {
		AssociadoBO bo = new AssociadoBO();
		bo.salvar(associado);

	}

	@Override
	public void removerAssociado(Long id) {
		AssociadoBO bo = new AssociadoBO();
		bo.remover(id);
	}

	@Override
	public List<Associado> listarAssociadosPorNome(String nomeAssociado) {
		AssociadoBO bo = new AssociadoBO();
		return bo.listarPorNome(nomeAssociado);
	}

	@Override
	public void salvarVideogame(Videogame videogame) {
		VideogameBO bo = new VideogameBO();
		bo.salvar(videogame);
	}

	@Override
	public void removerVideogame(Long id) {
		VideogameBO bo = new VideogameBO();
		bo.remover(id);
	}

	@Override
	public List<Videogame> listarVideogames() {
		VideogameBO bo = new VideogameBO();
		return bo.listar();
	}

	@Override
	public Videogame encontrarPorId(Long id) {
		VideogameBO bo = new VideogameBO();
		return bo.encontrarPorId(id);
	}

	@Override
	public List<Associado> buscarLocatariosPorNome(String nomeLocatario) {
		AssociadoBO bo = new AssociadoBO();
		return bo.listarPorNome(nomeLocatario);
	}

	@Override
	public void salvarEmprestimo(Emprestimo emprestimo) {
		EmprestimoBO bo = new EmprestimoBO();
		bo.salvar(emprestimo);
	}

	@Override
	public List<Emprestimo> buscarEmprestimoPorLocatario(String nomeLocatario) {
		EmprestimoBO bo = new EmprestimoBO();
		return bo.buscarEmprestimoPoLocatario(nomeLocatario);
	}

	@Override
	public List<AssociadoVideogameJogo> buscarJogosPorNome(String nomeJogo) {
		AssociadoVideogameJogoBO bo = new AssociadoVideogameJogoBO();
		return bo.listarPorNome(nomeJogo);
	}

	@Override
	public Associado buscarAssociadoPorNomeDeUsuario(String nomeUsuario) {
		AssociadoBO associadoBO = new AssociadoBO();
		return associadoBO.buscarPorNomeDeUsuario(nomeUsuario);
	}

	@Override
	public void removerJogo(Long id) {
		AssociadoVideogameJogoBO bo = new AssociadoVideogameJogoBO();
		bo.remover(id);
		
	}

	@Override
	public void removerAssociadoVideogame(Long id) {
		AssociadoVideogameBO bo = new AssociadoVideogameBO();
		bo.remover(id);
	}

	@Override
	public Videogame buscarVideogame(Long idVideogame) {
		VideogameBO bo = new VideogameBO();
		return bo.encontrarPorId(idVideogame);
	}

	@Override
	public void salvarAssociadoJogo(AssociadoVideogameJogo jogo) {
		AssociadoVideogameJogoBO bo = new AssociadoVideogameJogoBO();
		bo.salvar(jogo);
	}

}
