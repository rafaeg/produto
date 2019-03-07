package br.com.empresa.DaoImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.LockModeType;
import javax.ws.rs.WebApplicationException;

import br.com.empresa.Dao.ICategoriaDao;
import br.com.empresa.EntityManager.JPAEntityManager;
import br.com.empresa.Model.Categoria;

public class CategoriaDaoImpl implements ICategoriaDao{
	
	private JPAEntityManager jpaEntityManager = new JPAEntityManager();
	
	private EntityManager em = jpaEntityManager.getEntityManager();
	

	public void salvarCategoria(Categoria categoria) {
		try {
			em.getTransaction().begin();
			em.persist(categoria);
			em.getTransaction().commit();
		}catch(Exception e) {
			em.getTransaction().rollback();
			throw new WebApplicationException(500);
		}
				
	}
	
	public void alterarCategoria(Categoria categoria) {
		
		try {
			em.getTransaction().begin();
			Categoria umaCategoria = em.find(Categoria.class, categoria.getId(),LockModeType.PESSIMISTIC_WRITE);
			if( umaCategoria != null)
				em.merge(umaCategoria);
			em.getTransaction().commit();
		}catch(Exception e) {
			em.getTransaction().rollback();
			throw new WebApplicationException(500);
		}
		
	}

	public List<Categoria> getListCategorias() {
		try {
			String query = "select c from Categoria c";
			return em.createQuery(query, Categoria.class).getResultList();
		}catch( Exception e ) {
			throw new WebApplicationException(500);
		}
	}
		
	public Categoria recuperarCategoria(int id) {
		try {
			Categoria achouCategoria = em.find( Categoria.class, id );
			if(achouCategoria != null)
				return achouCategoria;
		}catch( Exception e) {
			throw new WebApplicationException(500);
		}
		return null;
	}
	
	
	
}
