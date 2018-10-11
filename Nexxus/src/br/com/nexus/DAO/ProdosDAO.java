package br.com.nexus.DAO;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.Query;

import br.com.nexus.model.Prodos;

@Stateless
public class ProdosDAO extends DAO<Prodos>{
	
	public void adiciona (Prodos prodos){
		getEntityManager().persist(prodos);
	}
	
	@SuppressWarnings("unchecked")
	public List<Prodos> buscaTodos(){
		Query query = getEntityManager().createQuery("select x from Prodos x");
		return query.getResultList();
	}	
	
}
