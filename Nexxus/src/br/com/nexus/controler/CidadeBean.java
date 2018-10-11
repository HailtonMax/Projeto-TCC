package br.com.nexus.controler;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import br.com.nexus.DAO.CidadeDAO;
import br.com.nexus.model.Cidade;


@ManagedBean
public class CidadeBean extends Bean{
	
	private static final long serialVersionUID = 1L;
	
	private Cidade cidade = new Cidade();
	
	@Inject 
	CidadeDAO cidadeDAO;
	
	public void adicionaCidade() {
		cidadeDAO.adiciona(this.cidade);
		this.cidade = new Cidade();
		
	}
	
	public List<Cidade> getCidades() {
		return cidadeDAO.buscaTodos();
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
	
	

}
	
	
