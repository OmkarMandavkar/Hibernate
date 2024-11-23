
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class RefreshRecord {

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
            System.out.println("Before Refresh: " + c1);
            System.out.println("Associated Aircraft: " + c1.getAircraft());

            // Modify the Country entity (but this change won't be reflected in the database yet)
            c1.setContinent("Europe");

            // Commit the transaction (this will save the modified entity to the database)
            et.commit();
            System.out.println("Record updated and committed.");

            // Use refresh to reload the entity's state from the database
            em.refresh(c1);
            System.out.println("After Refresh: " + c1);
            System.out.println("Associated Aircraft: " + c1.getAircraft());
        } else {
            System.out.println("No record found for the specified Country.");
        }

        // Closing the EntityManager
        em.close();
        emf.close();
    }
}
