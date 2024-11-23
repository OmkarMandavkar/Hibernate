import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FetchRecord {
	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("FetchType");
		EntityManager em = emf.createEntityManager();

		Author a1 = em.find(Author.class, 1);

        if (a1 != null) {
            System.out.println("\n------      AUTHOR      ------");
            System.out.println("ID: " + a1.getId());
            System.out.println("Name: " + a1.getName());
            
            
            System.out.println("\n------      BOOK      ------");
            
            for (Book book : a1.getBooks()) {
                System.out.println("Book ID: " + book.getId());
                System.out.println("Title: " + book.getTitle());
                
                System.out.println("------------------------------");
            }

        }
		else {
			System.out.println("No Records Found");
		}
	}
}