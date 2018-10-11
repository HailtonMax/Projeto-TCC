package br.com.nexus.DAO;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import br.com.nexus.controler.Bean;

@Stateless
public abstract class DAO<Entity extends Bean> {
	/**
	 * @author Hailton <code>PersistenceContext</code> Classe Responsável pelo
	 *         controle do Datasource, este nome deve está configurado no
	 *         standalone.xml
	 * 
	 * **/
	@PersistenceContext(unitName = "nexus-pu")
	private EntityManager em;
	

	public EntityManager getEntityManager() {
		return em;
	}

	/**
	 * @author hailton
	 * 
	 *         Faz um select * from tabela
	 * 
	 * **/
	@SuppressWarnings("unchecked")
	public List<Entity> getAll(Class<Entity> classe) {
		String hql = "select o from " + classe.getSimpleName() + " o";
		return getEntityManager().createQuery(hql).getResultList();
	}

	@SuppressWarnings("unchecked")
	public List<Object> getAllNamedQuery(String namedQuery) {

		try {
			Query query = getEntityManager().createNamedQuery(namedQuery);
			return query.getResultList();
		} catch (NoResultException e) {
			return null;
		}

	}

	@SuppressWarnings("unchecked")
	public List<Object> getAllQuery(String jpql) {
		try {
			return getEntityManager().createQuery(jpql).getResultList();
		} catch (NoResultException e) {
			return null;
		}

	}

	public Entity getById(Class<Entity> classe, Long pk) {
		try {
			return getEntityManager().find(classe, pk);
		} catch (NoResultException e) {
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	public Entity getBySingle(Class<Entity> classe) {
		String hql = "select o from " + classe.getSimpleName() + " o";
		return (Entity) getEntityManager().createQuery(hql).getSingleResult();
	}

	public void remove(Class<Entity> classe, Long pk) {
		getEntityManager().remove(getEntityManager().getReference(classe, pk));
	}

	public void remove(Entity classe) {
		getEntityManager().remove(classe);
	}

	public Entity save(Entity entity) {
		Entity saved = null;
		saved = getEntityManager().merge(entity);
		return saved;
	}
	
	 
	  
	 

	

}
