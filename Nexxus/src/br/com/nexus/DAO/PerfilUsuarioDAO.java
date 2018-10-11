package br.com.nexus.DAO;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.Query;

import br.com.nexus.model.PerfilUsuario;

@Stateless
public class PerfilUsuarioDAO extends DAO<PerfilUsuario>{
	
	public void adiciona (PerfilUsuario perfilUsuario){
		getEntityManager().persist(perfilUsuario);
	}
	
	@SuppressWarnings("unchecked")
	public List<PerfilUsuario> buscaTodos(){
		Query query = getEntityManager().createQuery("select x from PerfilUsuario x");
		return query.getResultList();
	}	
	
}

