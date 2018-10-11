package br.com.nexus.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import br.com.nexus.controler.Bean;

@Entity
public class PerfilUsuario extends Bean{
	
	private static final long serialVersionUID = 1L;

	
	@Id @GeneratedValue	
	@Column(name="id_perfilUsuario")	
	private Integer idPerfilUsuario;
	
	private String descricao;
	public Integer getId() {
		return idPerfilUsuario;
	}
	public void setId(int id) {
		this.idPerfilUsuario = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	

}
