package main;
import interfaces.Transaction;
import labclasses.*;
import transactions.TransactionFactory;
public class MainPage {
	public static void main(String[] args)
	{
		Ece edept =new Ece();
		edept.bee();
		edept.facultyList();
		Department cdept=new Cse();
		cdept.facultyList();
		TransactionFactory selectTransact = new TransactionFactory();
		Transaction transact = selectTransact.selectTransaction("StudentFee");
		transact.type();
		transact.paymentMadeInfo();
		transact.ledgerDetailsUpdate();
	}
}
