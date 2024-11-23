
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertRecord {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateCRUD");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Student student = new Student();
		student.setEmail("krypto@gmail.com");
		student.setName("Zeus");
		student.setPhone(99887766);
		student.setSid(01);

		Student student2 = new Student();
		student2.setEmail("pd@gmail.com");
		student2.setName("Poseidon");
		student2.setPhone(99888866);
		student2.setSid(02);

		
		et.begin();
		em.persist(student);
		em.persist(student2);
		et.commit();

		System.out.println("Saved");
	}
}