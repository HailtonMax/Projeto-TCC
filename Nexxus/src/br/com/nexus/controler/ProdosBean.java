package br.com.nexus.controler;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import br.com.nexus.DAO.ProdosDAO;
import br.com.nexus.model.Prodos;

@ManagedBean
public class ProdosBean extends Bean{
	
	private static final long serialVersionUID = 1L;
	
	private Prodos prodos = new Prodos();
	@Inject ProdosDAO prodosDAO;
	
	public void adicionaProdos() {
		prodosDAO.adiciona(this.prodos);
		this.prodos = new Prodos();
		
	}
	
	public List<Prodos> getProdoss() {
		return prodosDAO.buscaTodos();
	}

	public Prodos getProdos() {
		return prodos;
	}

	public void setProdos(Prodos prodos) {
		this.prodos = prodos;
	}
	
	

}
