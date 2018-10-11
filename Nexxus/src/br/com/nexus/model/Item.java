package br.com.nexus.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import br.com.nexus.controler.Bean;

@Entity
@Table(name="item")
@SequenceGenerator(name="item_id_item_seq", sequenceName="item_id_item_seq",allocationSize=1)
public class Item extends Bean{
	
	private static final long serialVersionUID = 1L;
	
	@Id @GeneratedValue	
	@Column(name="id_item")
	private Integer idItem;
	
	private String tipoItem;
	private int vlUnit;
	private String nome;
	
	
	
	public Integer getId() {
		return idItem;
	}
	public void setId(Integer id) {
		this.idItem = id;
	}
	public String getTipoItem() {
		return tipoItem;
	}
	public void setTipoItem(String tipoItem) {
		this.tipoItem = tipoItem;
	}
	public int getVlUnit() {
		return vlUnit;
	}
	public void setVlUnit(int vlUnit) {
		this.vlUnit = vlUnit;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

}
