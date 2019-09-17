package wp.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class AccountEntry {
	public static void main(String[] args) {
		SessionFactory sf = Util.getSF();
		Session session = sf.openSession();
		Account a1 = new Account(1001, "HDFC", 200000);
		Account a2 = new Account(1002,"ICICI",150000);
		Account a3 = new Account(1003,"SBI",100000);

		Transaction tr = session.beginTransaction();
		session.save(a1); session.save(a2); session.save(a3);
		tr.commit();
		session.close();
		System.out.println("RECORD ADDED");

	}
}
