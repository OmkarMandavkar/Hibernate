import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertRecord {
	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("FetchType");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Author a1 = new Author();
		a1.setId(1);
		a1.setName("ABC");

		Book b1 = new Book();
		b1.setId(101);
		b1.setTitle("Book1");
		b1.setAuthor(a1);
		
		Book b2 = new Book();
		b2.setId(102);
		b2.setTitle("Book2");
		b2.setAuthor(a1);
		
		et.begin();
		em.persist(a1);
		em.persist(b1);
		em.persist(b2);
		et.commit();
		
		System.out.println("Records Saved");
	}

}
