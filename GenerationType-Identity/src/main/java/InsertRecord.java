
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertRecord {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("GTidentity");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Account_IDENTITY a1 = new Account_IDENTITY();
		a1.setName("Zeus");
		a1.setEmail("zeus@gmail.com");
		a1.setPhone(9876543210L);

		Account_IDENTITY a2 = new Account_IDENTITY();
		a2.setName("Krypto");
		a2.setEmail("krypto@gmail.com");
		a2.setPhone(9999443366L);

		Account_IDENTITY a3 = new Account_IDENTITY();
		a3.setName("Cloud9");
		a3.setEmail("cloud9@gmail.com");
		a3.setPhone(9988776655L);


		et.begin();
		em.persist(a1);
		em.persist(a2);
		em.persist(a3);
		et.commit();
		
		System.out.println("Records Saved");
	}
}