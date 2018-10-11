package br.com.nexus.DAO;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.Query;

import br.com.nexus.model.Status;

@Stateless
public class StatusDAO extends DAO<Status>{
	
	public void adiciona (Status status){
		getEntityManager().persist(status);
	}
	
	@SuppressWarnings("unchecked")
	public List<Status> buscaTodos(){
		Query query = getEntityManager().createQuery("select x from Status x");
		return query.getResultList();
	}	
	
}

