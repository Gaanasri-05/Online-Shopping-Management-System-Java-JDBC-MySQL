package zomato;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveOrder {
	public static void main(String[] args) {
		
	
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	
	 EntityManager em= emf.createEntityManager();
	 
	 EntityTransaction et= em.getTransaction();

	   Orders o = new Orders(0,"Nitish",787153578, "Coimbatore", null, null);
	   
	   et.begin();
	  
	   em.persist(o);
	   et.commit();
	}

}
