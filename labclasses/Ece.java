package labclasses;
import interfaces.CommonLabs;
import interfaces.ElectricalLabs;
public class Ece extends Department implements CommonLabs,ElectricalLabs{
	public void industrialExpReport()
	{
		System.out.println("Details about student Industrial Experience Report");
	}

	@Override
	public void ssLab() {
		System.out.println("SSLab performance");
		
	}

	@Override
	public void microwaveLab() {
		System.out.println("Microwave Lab performance");
		
	}

	@Override
	public void cLab() {
		System.out.println("C-Lab performance");
		
	}

	@Override
	public void bee() {
		System.out.println("BEE Lab performance");
		
	}

}