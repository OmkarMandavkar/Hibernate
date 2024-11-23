
import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertRecord {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("CascadeType");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();


		Aircraft a1 = new Aircraft();
		a1.setId(101);
		a1.setName("F-22 Raptor");
		a1.setGeneration(4);

		Aircraft a2 = new Aircraft();
		a2.setId(102);
		a2.setName("F-35 B Lightning");
		a2.setGeneration(5);

		Aircraft a3 = new Aircraft();
		a3.setId(103);
		a3.setName("Sukhoi-30");
		a3.setGeneration(4);

		Aircraft a4 = new Aircraft();
		a4.setId(104);
		a4.setName("Sukhoi-57");
		a4.setGeneration(5);

		Aircraft a5 = new Aircraft();
		a5.setId(105);
		a5.setName("LCA Tejas MK2");
		a5.setGeneration(5);

		
		Country c1 = new Country();
		c1.setCid(1);
		c1.setCname("USA");
		c1.setContinent("North America");

		Country c2 = new Country();
		c2.setCid(2);
		c2.setCname("Russia");
		c2.setContinent("Asia");

		Country c3 = new Country();
		c3.setCid(3);
		c3.setCname("India");
		c3.setContinent("Asia");

		
		c1.setAircraft(Arrays.asList(a1, a2));
		c2.setAircraft(Arrays.asList(a3, a4));
		c3.setAircraft(Arrays.asList(a5));

		
		et.begin();

		em.persist(c1);
		em.persist(c2);
		em.persist(c3);
		
		et.commit();
		System.out.println("Records Saved");
		
	}
}