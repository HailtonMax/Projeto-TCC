package br.com.nexus.controler;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import br.com.nexus.DAO.EstadoDAO;
import br.com.nexus.model.Estado;


@ManagedBean
public class EstadoBean extends Bean{
	
	private static final long serialVersionUID = 1L;
	
	private Estado estado = new Estado();
	@Inject EstadoDAO estadoDAO;
	
	public void adicionaEstado() {
		estadoDAO.adiciona(this.estado);
		this.estado = new Estado();
		
	}
	
	public List<Estado> getEstados() {
		return estadoDAO.buscaTodos();
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}
}
	