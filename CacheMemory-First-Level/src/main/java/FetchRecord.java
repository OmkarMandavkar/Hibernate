
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FetchRecord {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("FirstLevelCache");

		EntityManager em1 = emf.createEntityManager();

		UserFLC user1 = em1.find(UserFLC.class, 100);
		System.out.println("USER 1: " + user1);

		UserFLC user2 = em1.find(UserFLC.class, 100);
		System.out.println("USER 2: " + user2);

		UserFLC user3 = em1.find(UserFLC.class, 200);
		System.out.println("USER 3: " + user3);

		System.out.println("----------------------------------------------------");

		EntityManager em2 = emf.createEntityManager();

		UserFLC user4 = em2.find(UserFLC.class, 150);
		System.out.println("USER 4: " + user4);

		UserFLC user5 = em2.find(UserFLC.class, 200);
		System.out.println("USER 5: " + user5);
	}
}
