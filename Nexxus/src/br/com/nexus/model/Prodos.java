package br.com.nexus.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import br.com.nexus.controler.Bean;

@Entity
public class Prodos extends Bean{
	
	private static final long serialVersionUID = 1L;

	
	@Id @GeneratedValue
	
	@Column(name="id_prodos")
	private Integer idProdos;
	
	private int quantidade;
	private int subTotal;
	
	@ManyToOne(cascade = {})
	@JoinColumn(name = "id_item", referencedColumnName = "id_item")
	private Item idItem;
	
	public Item getIdItem() {
		return idItem;
	}

	public void setIdItem(Item idItem) {
		this.idItem = idItem;
	}
	
		
	public Integer getId() {
		return idProdos;
	}
	public void setId(int id) {
		this.idProdos = id;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public int getSubTotal() {
		return subTotal;
	}
	public void setSubTotal(int subTotal) {
		this.subTotal = subTotal;
	}
	
	
	
	

}
