//
//import java.util.Iterator;
//import java.util.List;
//
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.EntityTransaction;
//import javax.persistence.Persistence;
//
//public class EAGERFetchTypeExample {
//	public static void main(String[] args) {
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("FetchType");
//		EntityManager em = emf.createEntityManager();
//		EntityTransaction et = em.getTransaction();
////		et.begin();
////
////		// Creating and persisting an Author with some Books
////		EAGERAuthor author = new EAGERAuthor();
////		author.setName("ss Name");
////
////		EAGERBook book1 = new EAGERBook();
////		book1.setTitle("Book xxx");
////		book1.setAuthor(author);
////
////		EAGERBook book2 = new EAGERBook();
////		book2.setTitle("Book xxx");
////		book2.setAuthor(author);
////
////		em.persist(author);
////		em.persist(book1);
////		em.persist(book2);
////
////		et.commit();
//
//		// Fetching the author
//		Author fetchedAuthor = em.find(Author.class, 1l);
//
//		// Since FetchType is EAGER, books are already loaded here
//		System.out.println("Author Name: " + fetchedAuthor.getName());
////		List<EAGERBook> book = fetchedAuthor.getBooks();
//		for (Book ss : fetchedAuthor.getBooks()) {
//			System.out.println(ss.getTitle());
//			System.out.println(ss.getId());
////			System.out.println(ss.getAuthor());
//		}
////		for (EAGERBook eagerBook : book) {
////			System.out.println(eagerBook.getTitle());
////		}
//	
//		em.close();
//		emf.close();
//	}
//}
