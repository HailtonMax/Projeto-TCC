package br.com.nexus.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import br.com.nexus.controler.Bean;

@Entity
@Table(name="cliente")
@SequenceGenerator(name="cliente_id_cliente_seq", sequenceName="cliente_id_cliente_seq",allocationSize=1)
public class Cliente extends Bean{
	
	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="cliente_id_cliente_seq")
	@Column(name="id_cliente")
	private Integer id;
	
	private String nome;
	private String endereco;
	private String bairro;
	private String telefone;
	private String cgc;
	
	
	@ManyToOne(cascade={})
	@JoinColumn(name="id_cidade")
	private Cidade cidade;
	
	
	public Cidade getCidade() {
		return cidade;
	}
	
	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
	
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCgc() {
		return cgc;
	}
	public void setCgc(String cgc) {
		this.cgc = cgc;
	}
	
	
	
	

}
