package transactions;
import interfaces.Transaction;
public class TransactionFactory {
		public Transaction selectTransaction(String nameOfTransaction)
		{
			Transaction t;
			t= null;
			if(nameOfTransaction.equals("StudentFee")) {
				t= new StudentFee();
				//return new StudentFee;
			}
			else if(nameOfTransaction.equals("RenovationCost")) {
				t= new RenovationCost();
				//return new RenovationCost();
			}
			return t;
		}
}