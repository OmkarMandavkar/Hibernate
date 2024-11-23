import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertRecord {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("FetchType");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();	
		
		Author author = new Author();
		author.setId(1);
		author.setName("Zeus");

		Book book1 = new Book();
		book1.setId(101);
		book1.setTitle("Book1");
		book1.setAuthor(author);

		Book book2 = new Book();
		book2.setId(102);
		book2.setTitle("Book2");
		book2.setAuthor(author);

//		author.setBooks(Arrays.asList(book1, book2));
		
		et.begin();

		em.persist(author);
		em.persist(book1);
		em.persist(book2);

		et.commit();
		System.out.println("Records Saved");
	}

}
