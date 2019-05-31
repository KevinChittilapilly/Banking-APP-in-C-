package banking;

public class saving extends account {
	int safetyboxid,safetykey;
	public saving(String name,String ssn,double initDeposit) {
		super(name,ssn,initDeposit);
		accountNumber = "1"+accountNumber;
		setSafetyDepositBox();
		}
	private void setSafetyDepositBox() {
		safetyboxid = (int) (Math.random()*1000);
		safetykey = (int)(Math.random()*10000);
	}
	public void setRate() {
		rate = getBaseRate()-0.25;
	}
	public void showInfo() {
		super.showInfo();
		System.out.println("Your Saving Account"+"\n Safety Box ID: "+safetyboxid+"\nSafety Deposit Box Key: "
		+safetykey);
	}
}
