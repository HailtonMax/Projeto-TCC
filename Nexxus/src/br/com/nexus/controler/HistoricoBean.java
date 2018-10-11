package br.com.nexus.controler;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import br.com.nexus.DAO.HistoricoDAO;
import br.com.nexus.model.Historico;


@ManagedBean
public class HistoricoBean extends Bean{
	
	private static final long serialVersionUID = 1L;
	
	private Historico historico = new Historico();
	@Inject HistoricoDAO historicoDAO;
	
	public void adicionaHistorico() {
		historicoDAO.adiciona(this.historico);
		this.historico = new Historico();
		
	}
	
	public List<Historico> getHistoricos() {
		return historicoDAO.buscaTodos();
	}

	public Historico getHistorico() {
		return historico;
	}

	public void setHistorico(Historico historico) {
		this.historico = historico;
	}
	
	

}
