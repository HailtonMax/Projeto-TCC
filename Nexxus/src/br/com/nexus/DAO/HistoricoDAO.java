package br.com.nexus.DAO;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.Query;

import br.com.nexus.model.Historico;

@Stateless
public class HistoricoDAO extends DAO<Historico>{
	
	

	public void adiciona (Historico historico){
		getEntityManager().persist(historico);
	}
	
	@SuppressWarnings("unchecked")
	public List<Historico> buscaTodos(){
		Query query = getEntityManager().createQuery("select x from Historico x");
		return query.getResultList();
	}	
	
}

