package br.com.nexus.controler;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import br.com.nexus.DAO.UsuarioDAO;
import br.com.nexus.model.Usuario;

@ManagedBean
public class UsuarioBean extends Bean{
	
	private static final long serialVersionUID = 1L;
	
	private Usuario usuario = new Usuario();
	private List<Usuario> usuarios;
	private Usuario usuarioPesquisa;
	private Usuario selectUsuario = new Usuario();
	
	@Inject 
	UsuarioDAO usuarioDAO;
	
	public void init() {
		usuarioPesquisa = new Usuario();
		
	}
	
	
	public void adicionaUsuario() {
		this.usuario.setId(null);
		usuarioDAO.save(this.usuario);
		this.usuario = new Usuario();
	}
	
	public void alterarUsuario() {
		usuarioDAO.alterarUsuario(selectUsuario);
		this.selectUsuario = new Usuario();
	}
	
	
	public List<Usuario> getUsuarios() {
		if (usuarios == null) {
			usuarios = (List<Usuario>) usuarioDAO.getAll(Usuario.class);
		}
		return usuarios;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}


	public Usuario getUsuarioPesquisa() {
		return usuarioPesquisa;
	}


	public void setUsuarioPesquisa(Usuario usuarioPesquisa) {
		this.usuarioPesquisa = usuarioPesquisa;
	}
	
	

}
