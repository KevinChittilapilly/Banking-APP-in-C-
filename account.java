package banking;
//this file is for storing info that is common for both types of account i.e. savings and checking
public abstract class account implements iBaserate  {
	String name;
	String ssn;
	double balance;
	String accountNumber;
	double rate;
	static int index=1000;
	public account(String name,String ssn,double initDeposit) {
		index++;
		this.name=name;
		this.ssn=ssn;
		this.balance=initDeposit;
		this.accountNumber = setAccountNumber();
		setRate();
	}
	public abstract void setRate();
	//we are setting this function to be abstract because both checking and saving are using it
	
	private String setAccountNumber() {
		 this.ssn = ssn.substring(ssn.length()-2,ssn.length());
		int uniqueid=index;
		int randomNum = (int)(Math.random()*1000);
		return ssn+uniqueid+randomNum;
	}
	public void compound() {
		double accuredInterest = balance * (rate/100);
		balance = balance + accuredInterest;
		System.out.println("Accured Interest "+accuredInterest);
		printBalance();
	}
	public void deposit(double amount) {
		balance = balance + amount;
		System.out.println("Depositing $" + amount);
		printBalance();
	}
	public void withdraw(double amount) {
		balance = balance + amount;
		System.out.print("Withdrawing "+ amount);
		printBalance();
	}
	public void transfer(String accountname,double amount) {
		balance = balance-amount;
		System.out.print("Transferring "+amount);
	}
	public void printBalance() {
		System.out.println("Balance: "+balance);
	}
	public void showInfo() {
		System.out.println("Name "+name+"\nAccount No. "+accountNumber+"\nBalance"+balance);
	}
}
