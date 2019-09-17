package wp.hibernate;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

public class QBCProjection {
	public static void main(String args[]) {
		Session session=Util.getSF().openSession();
		Criteria cr= session.createCriteria(Emp.class);
		ProjectionList plist= Projections.projectionList();
		Projection p1= Projections.property("ename");
		Projection p2= Projections.property("eno");
		plist.add(p1);
		plist.add(p2);
		cr.setProjection(plist);
		List<Object[]> li=cr.list();
		for(Object object[]:li)
		{
			for(Object obj:object)
			{
				System.out.println(obj);
			}
		}
	}
}
