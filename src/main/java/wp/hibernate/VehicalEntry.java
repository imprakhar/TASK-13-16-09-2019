package wp.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class VehicalEntry {

	public static void main(String[] args) {
		SessionFactory sf=Util.getSF();
		Session session=sf.openSession();
		
		Vehical v1= new Vehical(101, "Audi", "A8", 15000000);
		Vehical v2= new Vehical(102, "Jaguar", "XF", 35000000);
		Vehical v3= new Vehical(103, "RangeRover", "Landcruizer", 5000000);
		
		Transaction tr = session.beginTransaction();
		session.save(v1); session.save(v2); session.save(v3);
		tr.commit();
		session.close();
		System.out.println("RECORD ADDED");

	}

}
