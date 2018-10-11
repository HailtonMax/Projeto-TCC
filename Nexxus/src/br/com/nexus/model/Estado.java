package br.com.nexus.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.nexus.controler.Bean;


@Entity
@Table(name="estado")
public class Estado extends Bean{
	
	private static final long serialVersionUID = 1L;
	
	@Id 
	@Column(name="id_estado")
	private Integer idEstado;
	
	private String nome;
	
	private String uf;
	
	public Integer getId() {
		return idEstado;
	}
	public void setId(int id) {
		this.idEstado = id;
	}
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	
	

}
