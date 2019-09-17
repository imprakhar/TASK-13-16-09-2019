package wp.hibernate;

import org.hibernate.Session;

public class AccountSearch {
	public static void main(String[] args) {
		Session session=Util.getSF().openSession();
		Account account=session.get(Account.class, 1001);
		System.out.println(account.getAccount());
		System.out.println(account.getBalance());
		System.out.println(account.getBank());
		System.out.println(account.getEmp().getEno());
		System.out.println(account.getEmp().getEname());
		System.out.println(account.getEmp().getSal());
		session.close();
	}
}
