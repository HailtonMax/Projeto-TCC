package br.com.nexus.DAO;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.Query;

import br.com.nexus.model.Usuario;

@Stateless
public class UsuarioDAO extends DAO<Usuario>{
	
	public void adiciona (Usuario usuario){
		getEntityManager().persist(usuario);
	}
	
	@SuppressWarnings("unchecked")
	public List<Usuario> buscaTodos(){
		Query query = getEntityManager().createQuery("select x from Usuario x");
		return query.getResultList();
	}
	
	public void alterarUsuario(Usuario usuario){
		if(usuario.getNome() != null){
			getEntityManager().merge(usuario);
		}
	}
	
}

