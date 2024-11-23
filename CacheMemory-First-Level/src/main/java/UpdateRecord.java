
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateRecord {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Annotations");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		et.begin();

		UserFLC user = em.find(UserFLC.class, 1);

		if (user != null) {
			user.setName("Krypto");
			em.merge(user);
			et.commit();
			System.out.println("Record Updated");
		} 
		else {
			System.out.println("No Record Found");
		}
	}
}