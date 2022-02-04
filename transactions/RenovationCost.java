package transactions;
import interfaces.Transaction;
public class RenovationCost implements Transaction {

	public void type() {
		System.out.println("Renovation Costs");
		
	}

	public void paymentMadeInfo() {
		System.out.println("Contractor details,amount paid,date");
		
	}

	public void ledgerDetailsUpdate() {
		System.out.println("ledger details before");
		System.out.println("ledger details after");
		
	}
	
}
