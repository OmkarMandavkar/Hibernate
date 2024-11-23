
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Fetch {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("UniOneToMany");
		EntityManager em = emf.createEntityManager();

		Bank bank = em.find(Bank.class, 101);

		if (bank != null) {
			System.out.println("----    BANK    ----");
			System.out.println(bank);

			List<Account> accounts = bank.getAccounts();
			System.out.println("----    ACCOUNT    ----");
			for (Account account : accounts) {
				System.out.println(account);
			}
		} 
		else {
			System.out.println("Not Found");
		}
	}
}
