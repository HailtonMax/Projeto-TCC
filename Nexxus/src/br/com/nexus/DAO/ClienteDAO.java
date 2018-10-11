package br.com.nexus.DAO;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.nexus.model.Cliente;

@Stateless
public class ClienteDAO extends DAO<Cliente>{
	
	@SuppressWarnings("unused")
	private EntityManager manager;
	
	
//	public Cliente persistir (Cliente cliente){
//		Cliente saved = null;
//		saved = getEntityManager().merge(cliente);
//		return saved;	
//	}
	
	@SuppressWarnings("unchecked")
	public List<Cliente> buscaTodos(Cliente cliente){
		Query query = getEntityManager().createQuery("select x from Cliente x");
		return query.getResultList();
	}
	
	
	public void alterarCliente(Cliente cliente){
		if(cliente.getNome() != null){
			getEntityManager().merge(cliente);
		}
	}

	

	

	
	
	
	
		
}
