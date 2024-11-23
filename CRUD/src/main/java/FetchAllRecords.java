
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchAllRecords {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateCRUD");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		et.begin();

		Query query = em.createQuery("select s from Student s");

		List<Student> students = query.getResultList();
		System.out.println("\n************** Student Details **************\n");
		for (Student student : students) {
			System.out.println(student);
			System.out.println("------------------------------------------");
		}

		et.commit();
	}
}