package amazon;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SelectProductById {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em1 = emf.createEntityManager();
		EntityManager em2= emf.createEntityManager();
		EntityManager em3 = emf.createEntityManager();
	
		Product p = em1.find(Product.class,2);
		em2.find(Product.class,1);
		em3.find(Product.class,3);
		System.out.println(p);

	}

}
