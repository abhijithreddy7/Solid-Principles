package labclasses;
import interfaces.CommonLabs;
public class Cse extends Department implements CommonLabs{
	public void computerLabs()
	{
		System.out.println("Details about student performance in Computerlabs");
	}

	@Override
	public void cLab() {
		System.out.println("Clab perforamance details");
		
	}

	@Override
	public void bee() {
		System.out.println("BEE perforamance details");
	}

}
