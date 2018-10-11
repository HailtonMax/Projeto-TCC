package br.com.nexus.controler;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import br.com.nexus.DAO.OcorrenciaDAO;
import br.com.nexus.model.Ocorrencia;

@ManagedBean
public class OcorrenciaBean extends Bean{
	
	private static final long serialVersionUID = 1L;
	
	private Ocorrencia ocorrencia = new Ocorrencia();
	@Inject OcorrenciaDAO ocorrenciaDAO;
	
	public void adicionaOcorrencia() {
		ocorrenciaDAO.adiciona(this.ocorrencia);
		this.ocorrencia = new Ocorrencia();
		
	}
	
	public List<Ocorrencia> getOcorrencias() {
		return ocorrenciaDAO.buscaTodos();
	}

	public Ocorrencia getOcorrencia() {
		return ocorrencia;
	}

	public void setOcorrencia(Ocorrencia ocorrencia) {
		this.ocorrencia = ocorrencia;
	}
	
	

}
