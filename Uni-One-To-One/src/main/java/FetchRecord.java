import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class FetchRecord {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("UniOneToOne");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		et.begin();
	
		Car c1 = em.find(Car.class, 101);
		
		if(c1!= null) {
			System.out.println("\n<----    CAR    ---->");
			System.out.println(c1);
			
			Engine e1 = em.find(Engine.class, 111);
			System.out.println("\n<----    ENGINE    ---->");
			System.out.println(e1);
		}
		else {
			System.out.println("No Record Found");
		}
	}
}