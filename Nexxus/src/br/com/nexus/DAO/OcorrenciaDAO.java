package br.com.nexus.DAO;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.Query;

import br.com.nexus.model.Ocorrencia;

@Stateless
public class OcorrenciaDAO extends DAO<Ocorrencia>{
	
	public void adiciona (Ocorrencia ocorrencia){
		getEntityManager().persist(ocorrencia);
	}
	
	@SuppressWarnings("unchecked")
	public List<Ocorrencia> buscaTodos(){
		Query query = getEntityManager().createQuery("select x from Ocorrencia x");
		return query.getResultList();
	}	
	
}
