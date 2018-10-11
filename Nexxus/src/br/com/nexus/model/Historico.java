package br.com.nexus.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import br.com.nexus.controler.Bean;

@Entity
public class Historico extends Bean{
	
	private static final long serialVersionUID = 1L;
	
	@Id @GeneratedValue	
	@Column(name="id_historico")
	private Integer idHistorico;
	private String dataHistorico;
	private String observacao;
	
	public Integer getId() {
		return idHistorico;
	}
	public void setId(int id) {
		this.idHistorico = id;
	}
	public String getDataHistorico() {
		return dataHistorico;
	}
	public void setDataHistorico(String dataHistorico) {
		this.dataHistorico = dataHistorico;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	
	

}
