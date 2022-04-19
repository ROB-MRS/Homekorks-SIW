package it.uniroma3.siw.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ProductMain {

//	public static void main(String[] args) {
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("products-unit");
//		EntityManager em = emf.createEntityManager();
//		Product product = new Product();
//		product.setName("KRIDDIG");
//		product.setPrice(3.5F);
//		product.setDescription("A wonderful bla bla");
//		product.setCode("pt000154");
//
//		EntityTransaction tx = em.getTransaction();
//		tx.begin();
//		em.persist(product);
//		tx.commit();
//
//		em.close();
//		emf.close();
//	}
	
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("products-unit");
		EntityManager em = emf.createEntityManager();
		em.close();
		emf.close();
	}

	
}
