
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertRecord {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("FirstLevelCache");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		UserFLC user = new UserFLC();
		user.setName("User4");
		user.setEmail("U4@gmail.com");
		user.setPhone(8888899999L);

		et.begin();
		em.persist(user);
		et.commit();
		
		System.out.println("Records Saved");
	}
}
