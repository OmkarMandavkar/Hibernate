
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FetchRecord {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("SecondLevelCache");

		EntityManager em1 = emf.createEntityManager();

		UserSLC user1 = em1.find(UserSLC.class, 99);
		System.out.println("USER 1: " + user1);

		UserSLC user2 = em1.find(UserSLC.class, 99);
		System.out.println("USER 2: " + user2);

		UserSLC user3 = em1.find(UserSLC.class, 100);
		System.out.println("USER 3: " + user3);

		System.out.println("----------------------------------------------------");

		EntityManager em2 = emf.createEntityManager();

		UserSLC user4 = em2.find(UserSLC.class, 100);
		System.out.println("USER 4: " + user4);

		UserSLC user5 = em2.find(UserSLC.class, 101);
		System.out.println("USER 5: " + user5);
	}
}
