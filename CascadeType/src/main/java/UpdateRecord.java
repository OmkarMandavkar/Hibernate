
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateRecord {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("CascadeType");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		et.begin();

		Country c1 = em.find(Country.class, 2);

		if (c1 != null) {
			c1.setContinent("Europe");
			Aircraft a1 = em.find(Aircraft.class, 102);

			if (a1 != null) {
				System.out.println("OLD RECORD: " + a1);

				a1.setName("B2 Spirit Bomber");

//				et.commit();
				System.out.println("Record Updated");
				System.out.println("NEW RECORD: " + a1);
			}
		} 
		else {
			System.out.println("No Record Found");
		}

		em.merge(c1);
		et.commit();
	}
}