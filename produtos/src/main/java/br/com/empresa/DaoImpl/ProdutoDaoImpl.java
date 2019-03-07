package br.com.empresa.DaoImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.LockModeType;
import javax.persistence.TypedQuery;
import javax.ws.rs.WebApplicationException;

import br.com.empresa.Dao.IProdutoDao;
import br.com.empresa.EntityManager.JPAEntityManager;
import br.com.empresa.Model.Produto;

public class ProdutoDaoImpl implements IProdutoDao {

	private JPAEntityManager jpaEntityManager = new JPAEntityManager();
	private EntityManager em = jpaEntityManager.getEntityManager();

	public void salvarProduto(Produto produto) {
		try {
			em.getTransaction().begin();
			em.persist(produto);
			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().rollback();
			throw new WebApplicationException(500);
		}
	}

	public void alterarProduto(Produto produto) {
		try {
			em.getTransaction().begin();
			Produto umProduto = em.find(Produto.class, produto.getId(), LockModeType.PESSIMISTIC_WRITE);
			if (umProduto != null)
				em.merge(umProduto);
			em.getTransaction().commit();
		} catch (Exception e) {
			throw new WebApplicationException(500);
		}
	}

	public List<Produto> getListProdutos() {
		return em.createQuery(" from Produto ", Produto.class).getResultList();
	}

	public void delete(int id) {
		try {
			Produto achouProduto = em.find(Produto.class, id);
			if (achouProduto != null) {
				em.getTransaction().begin();
				em.remove(achouProduto);
				em.getTransaction().commit();
			}
		} catch (Exception e) {
			throw new WebApplicationException(500);
		}
	}

	public List<Produto> getProduto(int id) {
		try {
			String query = " select p from Produto p "
						  + " join p.categoria "
						  + " where p.id = :id ";
			
			TypedQuery<Produto> qry = em.createQuery(query, Produto.class).setParameter("id", id);
			List<Produto> achouProduto = qry.getResultList();
			
				if(!achouProduto.isEmpty())
					return achouProduto;
				else
					return null;
		} catch (Exception e) {
			throw new WebApplicationException(500);
		}
	}

}
