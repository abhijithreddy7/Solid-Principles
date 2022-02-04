package transactions;
import interfaces.Transaction;
public class StudentFee implements Transaction{

	public void type() {
		System.out.println("student Fee");
		
	}

	public void paymentMadeInfo() {
		System.out.println("student id,amount paid,date");
		
	}

	public void ledgerDetailsUpdate() {
		System.out.println("ledger details before");
		System.out.println("ledger details after");
		
	}
	

}
