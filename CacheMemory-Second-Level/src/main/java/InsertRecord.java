import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertRecord {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("SecondLevelCache");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		UserSLC user = new UserSLC();
		user.setName("Groot4");
		user.setEmail("gt@gmail.com");
		user.setPhone(9875533210L);

//		UserSLC user2 = new UserSLC();
//		user2.setName("ndy");
//		user2.setEmail("ND@gmail.com");
//		user2.setPhone(9543210L);

//		UserSLC user3 = new UserSLC();
//		user3.setName("Valkarie");
//		user3.setEmail("vt@gmail.com");
//		user3.setPhone(9876543210L);

		et.begin();
		em.persist(user);
//		em.persist(user2);
//		em.persist(user3);
		et.commit();

		System.out.println("Records Saved");
	}
}