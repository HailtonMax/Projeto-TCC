package br.com.nexus.DAO;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.Query;

import br.com.nexus.model.Cidade;

@Stateless
public class CidadeDAO extends DAO<Cidade>{
	
	
	public Cidade adiciona (Cidade cidade){
		Cidade saved = null;
		saved = getEntityManager().merge(cidade);
		return saved;
	}
	
	@SuppressWarnings("unchecked")
	public List<Cidade> buscaTodos(){
		Query query = getEntityManager().createQuery("select x from Cidade x");
		return query.getResultList();
	}	
	
}

	
