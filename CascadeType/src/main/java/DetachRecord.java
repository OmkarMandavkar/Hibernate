
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DetachRecord {

    public static void main(String[] args) {

        // Create EntityManagerFactory and EntityManager
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CascadeType");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        // Begin the transaction
        et.begin();

        // Find a Country record from the database
        Country c1 = em.find(Country.class, 1);

        if (c1 != null) {
            System.out.println("Before Detach: " + c1);
            System.out.println("Associated Aircraft: " + c1.getAircraft());

            // Modify the Country entity (but this change won't be persisted if detached)
            c1.setContinent("North America");

            // Detach the entity to stop tracking it in the current persistence context
            em.detach(c1);
            System.out.println("Entity detached. Changes will not be persisted.");

            // The changes will not be persisted, and the entity is no longer managed
            // Commit the transaction
//            et.commit();
            System.out.println("Transaction committed (but the detached entity's changes are not saved).");

            // Print the entity again to show that it's no longer managed
            System.out.println("After Detach: " + c1);
            System.out.println("Associated Aircraft: " + c1.getAircraft());
        } else {
            System.out.println("No record found for the specified Country.");
        }

        // Closing the EntityManager
        em.close();
        emf.close();
    }
}
