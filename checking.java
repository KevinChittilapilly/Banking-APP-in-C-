package banking;

public class checking extends account {
	int debitcardno;
	int debitpin;
	public checking(String name,String ssn,double initDeposit) {
		super(name,ssn,initDeposit);
		accountNumber="2" + accountNumber;
		setDebitCard();
	}
	@Override
	public void setRate() {
		rate = getBaseRate()*.15;
	}
	private void setDebitCard() {
		debitcardno = (int)(Math.random()*Math.pow(10, 12));
		debitpin = (int)(Math.random()*Math.pow(10, 4));
	}
	public void showInfo() {
		super.showInfo();
		System.out.println("Your Checking Account Features"+"\n Debit Card Number "+debitcardno+"\nDebit Card Pin"+debitpin);
	}

}
