package wp.hibernate;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;

public class HQL {
	public static void main(String[] args) {
		Session session=Util.getSF().openSession();
		Criteria cr= session.createCriteria(Emp.class);
		String hql="from Emp where sal>:lowest order by ename desc";
		Query query=session.createQuery(hql);
		query.setParameter("lowest", 60000);
		List<Emp> list= query.list();
		for(Emp e:list)
		{
			System.out.println(e);
		}
	}
	
}
