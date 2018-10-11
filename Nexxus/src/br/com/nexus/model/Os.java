package br.com.nexus.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import br.com.nexus.controler.Bean;

@Entity
@Table(name = "os")
@SequenceGenerator(name = "os_id_os_seq", sequenceName = "os_id_os_seq", allocationSize = 1)
public class Os extends Bean {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name = "id_os")
	private Integer id;

	private Date dataEmissao;
	private Date dtEntrega;
	private String descricao;
	private int valorTotal;

	@ManyToOne(cascade = {})
	@JoinColumn(name = "id_prodos", referencedColumnName = "id_prodos")
	private Prodos id_Prodos;

	@ManyToOne(cascade = {})
	@JoinColumn(name = "id_usuario", referencedColumnName = "id_usuario")
	private Usuario idUsuario;
	
	@ManyToOne(cascade = {})
	@JoinColumn(name = "id_cliente", referencedColumnName = "id_cliente")
	private Cliente idCliente;
	
	@ManyToOne(cascade = {})
	@JoinColumn(name = "id_item", referencedColumnName = "id_item")
	private Item idItem;

	
	
	public Item getIdItem() {
		return idItem;
	}

	public void setIdItem(Item idItem) {
		this.idItem = idItem;
	}

	

	public Usuario getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Usuario idUsuario) {
		this.idUsuario = idUsuario;
	}

	public Prodos getId_Prodos() {
		return id_Prodos;
	}

	public void setId_Prodos(Prodos id_Prodos) {
		this.id_Prodos = id_Prodos;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDataEmissao() {
		return dataEmissao;
	}

	public void setDataEmissao(Date dataEmissao) {
		this.dataEmissao = dataEmissao;
	}

	public Date getDtEntrega() {
		return dtEntrega;
	}

	public void setDtEntrega(Date dtEntrega) {
		this.dtEntrega = dtEntrega;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(int valorTotal) {
		this.valorTotal = valorTotal;
	}

	public Cliente getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Cliente idCliente) {
		this.idCliente = idCliente;
	}
	
	

}
