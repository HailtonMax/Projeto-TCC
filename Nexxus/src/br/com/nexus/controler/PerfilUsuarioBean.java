package br.com.nexus.controler;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import br.com.nexus.DAO.PerfilUsuarioDAO;
import br.com.nexus.model.PerfilUsuario;

@ManagedBean
public class PerfilUsuarioBean extends Bean{
	
	private static final long serialVersionUID = 1L;
	
	private PerfilUsuario perfilUsuario = new PerfilUsuario();
	@Inject PerfilUsuarioDAO perfilUsuarioDAO;
	
	public void adicionaPerfilUsuario() {
		perfilUsuarioDAO.adiciona(this.perfilUsuario);
		this.perfilUsuario = new PerfilUsuario();
		
	}
	
	public List<PerfilUsuario> getPerfilUsuarios() {
		return perfilUsuarioDAO.buscaTodos();
	}

	public PerfilUsuario getPerfilUsuario() {
		return perfilUsuario;
	}

	public void setPerfilUsuario(PerfilUsuario perfilUsuario) {
		this.perfilUsuario = perfilUsuario;
	}
	
	

}
