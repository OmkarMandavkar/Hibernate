import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FetchRecord {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("FetchType");
        EntityManager em = emf.createEntityManager();

        Author author = em.find(Author.class, 1); 

        if (author != null) {
            System.out.println("\n------      AUTHOR      ------");
            System.out.println("ID: " + author.getId());
            System.out.println("Name: " + author.getName());
            
            
            System.out.println("\n------      BOOK      ------");
            
            for (Book book : author.getBooks()) {
                System.out.println("Book ID: " + book.getId());
                System.out.println("Title: " + book.getTitle());
                
                System.out.println("------------------------------");
            }

        } 
        else {
            System.out.println("Author not found!");
        }

        em.close();
        emf.close();
    }
}
