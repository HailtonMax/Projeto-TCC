package br.com.nexus.controler;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

import br.com.nexus.DAO.ClienteDAO;
import br.com.nexus.model.Cliente;

@ManagedBean
@ViewScoped
public class ClienteBean extends Bean {

	private static final long serialVersionUID = 1L;

	private Cliente cliente = new Cliente();
	private List<Cliente> clientes;
	private Cliente clientePesquisa;
	private Cliente selectCliente = new Cliente();

	@Inject
	ClienteDAO clienteDAO;
	
	
	public void init() {
		clientePesquisa = new Cliente();
		// selectCliente = new Cliente();
	}

	public void adicionaCliente() {
		this.cliente.setId(null);
		clienteDAO.save(this.cliente);
		this.cliente = new Cliente();
	}

	public Cliente getClientePesquisa() {
		return clientePesquisa;
	}
	
	public void setClientePesquisa(Cliente clientePesquisa) {
		this.clientePesquisa = clientePesquisa;
	}

	public ClienteDAO getClienteDAO() {
		return clienteDAO;
	}

	public void setClienteDAO(ClienteDAO clienteDAO) {
		this.clienteDAO = clienteDAO;
	}

	public void alterarCliente() {
		clienteDAO.alterarCliente(selectCliente);
		this.selectCliente = new Cliente();
	}

	public List<Cliente> getClientes() {
		if (clientes == null) {
			clientes = (List<Cliente>) clienteDAO.getAll(Cliente.class);
		}
		return clientes;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	public void pesquisar() {
		clientes = clienteDAO.buscaTodos(clientePesquisa);
	}

	public Cliente getSelectCliente() {
		return selectCliente;
	}

	public void setSelectCliente(Cliente selectCliente) {
		this.selectCliente = selectCliente;
	}

}
