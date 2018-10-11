package br.com.nexus.DAO;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.Query;

import br.com.nexus.model.Estado;

@Stateless
public class EstadoDAO extends DAO<Estado>{
	
	public void adiciona (Estado estado){
		getEntityManager().persist(estado);
	}
	
	@SuppressWarnings("unchecked")
	public List<Estado> buscaTodos(){
		Query query = getEntityManager().createQuery("select x from Estado x");
		return query.getResultList();
	}	
	
}
