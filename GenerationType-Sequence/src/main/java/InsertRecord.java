
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertRecord {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("GTsequence");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
//		Account_SEQUENCE a1 = new Account_SEQUENCE();
//		a1.setName("Zeus");
//		a1.setEmail("zeus@gmail.com");
//		a1.setPhone(9876543210L);

//		Account_SEQUENCE a1 = new Account_SEQUENCE();
//		a1.setName("Krypto");
//		a1.setEmail("krypto@gmail.com");
//		a1.setPhone(9999443366L);
//
		Account_SEQUENCE a1 = new Account_SEQUENCE();
		a1.setName("Cloud9");
		a1.setEmail("cloud9@gmail.com");
		a1.setPhone(9988776655L);


		et.begin();
		em.persist(a1);
		et.commit();
		
		System.out.println("Records Saved");
	}
}
