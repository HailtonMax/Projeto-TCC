package br.com.nexus.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import br.com.nexus.controler.Bean;


@Entity
@Table(name="cidade")
public class Cidade extends Bean {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id_cidade")
	private Integer idCidade;

	private String nome;

	@ManyToOne(cascade={})
	@JoinColumn(name = "id_estado")
	private Estado estado;

	public Integer getId() {
		return idCidade;
	}

	public void setId(int id) {
		this.idCidade = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
	@Override
	public String toString() {
		return this.nome + "-" +this.estado.getUf();
	}

}
