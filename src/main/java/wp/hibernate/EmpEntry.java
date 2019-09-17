package wp.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class EmpEntry {

	public static void main(String[] args) {
		SessionFactory sf=Util.getSF();
		Session session=sf.openSession();
	
		Emp e1=new Emp(111,"AAA",50000, new Laptop("L111"),new Account(1001),new Vehical(101));
		Emp e2=new Emp(112,"BBB",60000, new Laptop("L112"),new Account(1002),new Vehical(102));
		Emp e3=new Emp(113,"CCC",70000, new Laptop("L113"),new Account(1003),new Vehical(103));
		
		Transaction tr=session.beginTransaction();
		session.save(e1); session.save(e2);
		session.save(e3); 
		tr.commit();
		session.close();
		System.out.println("RECORD ADDED");
	}

}
