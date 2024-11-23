
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateRecord {
	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("UniManyToOne");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		et.begin();

		Product p1 = em.find(Product.class, 101);

		if (p1 != null) {
			
			System.out.println("Old Record: " + p1);
			
			p1.setName("Apple");
			
			System.out.println("Product Updated");

			Review r1 = em.find(Review.class, 1);
			if (r1 != null) {
				r1.setMessage("Good Service");
				em.merge(r1);
				System.out.println("Review Updated");
			}
			em.merge(p1);
			
			et.commit();
			System.out.println("New Record: " + p1);
		} 
		else {
			System.out.println("No Record Found");
		}
		
	}
}