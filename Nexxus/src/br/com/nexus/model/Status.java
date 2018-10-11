package br.com.nexus.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import br.com.nexus.controler.Bean;

@Entity
public class Status extends Bean{
	
	private static final long serialVersionUID = 1L;

	
	@Id @GeneratedValue
	
	@Column(name="id_status")
	private Integer idStatus;
	
	private String status;
	public Integer getIdStatus() {
		return idStatus;
	}
	public void setIdStatus(int idStatus) {
		this.idStatus = idStatus;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	

}
