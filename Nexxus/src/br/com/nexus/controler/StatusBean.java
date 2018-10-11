package br.com.nexus.controler;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import br.com.nexus.DAO.StatusDAO;
import br.com.nexus.model.Status;

@ManagedBean
public class StatusBean extends Bean{
	
	private static final long serialVersionUID = 1L;
	
	private Status status = new Status();
	@Inject StatusDAO statusDAO;
	
	public void adicionaStatus() {
		statusDAO.adiciona(this.status);
		this.status = new Status();
		
	}
	
	public List<Status> getStatuss() {
		return statusDAO.buscaTodos();
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
	
	

}
