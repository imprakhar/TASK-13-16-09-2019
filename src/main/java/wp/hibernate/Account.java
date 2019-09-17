package wp.hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Account {
	@Id
	private int account;
	private String bank;
	private int balance;
	
	@OneToOne(mappedBy="acc")
	private Emp emp;
	
	public Emp getEmp() {
		return emp;
	}
	public void setEmp(Emp emp) {
		this.emp = emp;
	}
	public int getAccount() {
		return account;
	}
	public void setAccount(int account) {
		this.account = account;
	}
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public Account(int account, String bank, int balance) {
		super();
		this.account = account;
		this.bank = bank;
		this.balance = balance;
	}
	public Account(int account) {
		super();
		this.account = account;
	}
	
	public Account() {
		super();
	}
	@Override
	public String toString() {
		return "Account [account=" + account + ", bank=" + bank + ", balance=" + balance + "]";
	}
	
	
}
