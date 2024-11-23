
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteProduct {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("UniManyToOne");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		et.begin();

		Product p1 = em.find(Product.class, 101);

		if (p1 != null) {
			em.remove(p1);
			et.commit();
			System.out.println("Record Deleted");
		
			
			
			
		} else {
			System.out.println("No Record Found");
		}
	}
}