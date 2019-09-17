package wp.hibernate;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

public class QBCAccount {

	public static void main(String[] args) {
		Session session=Util.getSF().openSession();
		Criteria cr= session.createCriteria(Emp.class);
		Order o1=Order.desc("sal");
		cr.addOrder(o1);
		Criterion c1= Restrictions.gt("sal", 60000);
		Criterion c2= Restrictions.between("sal", 2000, 9000);
		Criterion c3= Restrictions.or(c1,c2);
		cr.add(c3);
		List<Emp> list=cr.list();
		for(Emp emp:list)
		{
			System.out.println(emp.getEno());
			System.out.println(emp.getEname());
			System.out.println(emp.getSal());
			System.out.println("______________________________________________________");
		}
	}

}
