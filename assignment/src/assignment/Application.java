package assignment;

public class Application {

	
	public static void main(String[] args) {
		
		
		Bank iciciBank=new Bank();
		iciciBank.openBankOperation();
		
		Account_holder nitin=new Account_holder("SB001", "Nitin Palecha", "SB", 10000.00);
		iciciBank.addAccountHolder(nitin);
		
		iciciBank.printAccountHolderInformation("SB001");
		iciciBank.printAllAccountHolderInformation();
		
		iciciBank.closeBankOperation();
		
	}
}
