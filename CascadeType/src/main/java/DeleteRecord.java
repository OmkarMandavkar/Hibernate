
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteRecord {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("CascadeType");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		et.begin();
		
		Country c1 = em.find(Country.class, 3);
		
		if(c1!=null) {
			
			em.remove(c1);
			System.out.println("Country's Record Deleted");
			
//			c1.getAircraft(); //even if not used data will be deleted from child entity
			et.commit();
		}
		else {
			System.out.println("No record found");
		}
	}
}