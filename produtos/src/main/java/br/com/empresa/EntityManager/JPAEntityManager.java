package br.com.empresa.EntityManager;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAEntityManager {
	
	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("empresa");
	private EntityManager em = factory.createEntityManager();
	
	public EntityManager getEntityManager() {
		return em;
	}
	
}
