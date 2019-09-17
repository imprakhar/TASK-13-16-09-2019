package wp.hibernate;

import org.hibernate.Session;

public class VehicalSearch {
public static void main(String[] args) {
	Session session=Util.getSF().openSession();
	Vehical vehical=session.get(Vehical.class, 101);
	System.out.println(vehical.getRegno());
	System.out.println(vehical.getBrand());
	System.out.println(vehical.getModel());
	System.out.println(vehical.getPrice());
		
		  System.out.println(vehical.getEmp().getEno());
		  System.out.println(vehical.getEmp().getEname());
		  System.out.println(vehical.getEmp().getSal());
		 
	session.close();
}
}
