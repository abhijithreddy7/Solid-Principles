package main;
interface commonMethods
{
	public void facultyList();
	public void students();
	public void type();
	public void paymentMadeInfo();
}
class Ece1 implements commonMethods{
	public void facultyList()
	{
		System.out.println("Faculty list");
	}
	public void students()
	{
		System.out.println("Student list");
	}
	public void computerLabs()
	{
		System.out.println("Details about student performance in Computerlabs");
	}
	public void cLab() {
		System.out.println("Clab perforamance details");
		
	}
	public void bee() {
		System.out.println("BEE perforamance details");
	}
	public void industrialExpReport()
	{
		System.out.println("Details about student Industrial Experience Report");
	}
	public void ssLab() {
		System.out.println("SSLab performance");
		
	}
	public void microwaveLab() {
		System.out.println("Microwave Lab performance");
		
	}
	@Override
	public void type() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void paymentMadeInfo() {
		// TODO Auto-generated method stub
		
	}
}
class Cse1 extends Ece1{
	@Override
	public void computerLabs()
	{
		System.out.println("Details about student performance in Computerlabs");
	}

	@Override
	public void cLab() {
		System.out.println("Clab perforamance details in Cse");
		
	}

	@Override
	public void bee() {
		System.out.println("BEE perforamance details in Cse");
	}

}
class StudentFee1 implements commonMethods{

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

	@Override
	public void facultyList() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void students() {
		// TODO Auto-generated method stub
		
	}
}
public class ViolatingCode {
	public static void main(String[] args)
	{
		Ece1 edept =new Ece1();
		edept.bee();
		Cse1 cdept=new Cse1();
		cdept.facultyList();
		StudentFee1 st = new StudentFee1();
		st.type();
		st.paymentMadeInfo();
		st.ledgerDetailsUpdate();
	}
}
