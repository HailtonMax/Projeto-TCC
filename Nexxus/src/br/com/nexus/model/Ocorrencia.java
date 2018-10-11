package br.com.nexus.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import br.com.nexus.controler.Bean;

@Entity
public class Ocorrencia extends Bean{
	
	private static final long serialVersionUID = 1L;
	
	@Id @GeneratedValue	
	@Column(name="id_ocorrencia")
	private Integer idOcorrencia;
	
	private String ocorrencia;
	public Integer getIdOcorrencia() {
		return idOcorrencia;
	}
	public void setIdOcorrencia(int idOcorrencia) {
		this.idOcorrencia = idOcorrencia;
	}
	public String getOcorrencia() {
		return ocorrencia;
	}
	public void setOcorrencia(String ocorrencia) {
		this.ocorrencia = ocorrencia;
	}
	
	

}
