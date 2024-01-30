package pack1;

public class Airtel implements Sim{
	
	public Airtel()
	{
		System.out.println("Airtel Constructor");
	}

	@Override
	public void calling() {
		System.out.println("Calling Using Airtel Sim");
		
	}

	@Override
	public void data() {
		System.out.println("Brwosing data using Airtel Sim");
		
	}

}
