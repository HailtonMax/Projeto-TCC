package br.com.nexus.DAO;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.nexus.model.Item;

@Stateless
public class ItemDAO extends DAO<Item>{
	
	@SuppressWarnings("unused")
	private EntityManager manager;
	
	public void adiciona (Item item){
		getEntityManager().persist(item);
	}
	
	@SuppressWarnings("unchecked")
	public List<Item> buscaTodos(){
		Query query = getEntityManager().createQuery("select x from Item x");
		return query.getResultList();
	}	
	
	public void alterarItem(Item item){
		if(item.getNome() != null){
			getEntityManager().merge(item);
		}
	}
	
}

