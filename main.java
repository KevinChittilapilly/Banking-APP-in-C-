package banking;
import java.util.*;
public class main {

	public static void main(String[] args) {
		List<account> acc = new LinkedList<account>();
		String file ="C:\\Users\\KEVIN\\Desktop\\NewBankAccounts.csv\\";
		List<String[]> newAccountHolders = utilities.CSV.read(file);
		for(String[] accountHolder: newAccountHolders) {
			String name = accountHolder[0];
			String ssn = accountHolder[1];
			String accounttype = accountHolder[2];
			double initDeposit = Double.parseDouble(accountHolder[3]);
			//the above line is written in order that the init deposit that is obtained in string
			//form can be converted into double
			if(accounttype.equals("Savings")) {
				acc.add(new saving(name,ssn,initDeposit));
			
		}
			else if(accounttype.equals("Checking")){
				acc.add(new checking(name,ssn,initDeposit));
			}
			else {
				System.out.println("Error");
			}
		
	}
		for(account a:acc) {
			System.out.println("**************");
			a.showInfo();
		}

}
}