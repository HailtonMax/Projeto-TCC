package br.com.nexus.DAO;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.nexus.model.Os;

@Stateless
public class OsDAO extends DAO<Os>{
	
	@SuppressWarnings("unused")
	private EntityManager manager;
	
	public void adiciona (Os os){
		getEntityManager().persist(os);
	}
	
	@SuppressWarnings("unchecked")
	public List<Os> buscaTodos(){
		Query query = getEntityManager().createQuery("select x from Os x");
		return query.getResultList();
	}

	public void alterarOs(Os os){
		if(os.getId() != null){
			getEntityManager().merge(os);
		}
	}	
	
}

