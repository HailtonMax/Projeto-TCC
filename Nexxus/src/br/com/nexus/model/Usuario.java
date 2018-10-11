package br.com.nexus.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import br.com.nexus.controler.Bean;
@Entity
@Table(name="usuario")
@SequenceGenerator(name="usuario_id_usuario_seq", sequenceName="usuario_id_usuario_seq",allocationSize=1)
public class Usuario extends Bean {
	
	private static final long serialVersionUID = 1L;

	
	@Id @GeneratedValue
	
	@Column(name="id_usuario")
	private Integer idUsuario;
	
	private String nome;
	private String login;
	
	
	public Integer getId() {
		return idUsuario;
	}
	public void setId(Integer id) {
		this.idUsuario = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	
	

}
