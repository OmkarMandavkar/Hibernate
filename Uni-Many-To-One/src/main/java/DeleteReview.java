
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteReview {
	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("UniManyToOne");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		et.begin();
		
		Review r1 = em.find(Review.class, 3);
		if(r1!=null) {
			
			em.remove(r1);
			et.commit();
			System.out.println("Record Deleted");
		}
		else {
			System.out.println("No Record Found");
		}
	}
}
