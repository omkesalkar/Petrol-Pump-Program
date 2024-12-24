package Dec_24_PetrolPump;

public class Car implements Runnable
{
	String Carname;
	PetrolPump petrolPump;
	
	public Car(String carname, PetrolPump petrolPump) {
		super();
		Carname = carname;
		this.petrolPump = petrolPump;
	}

	//run method pass the car name to the reference of PetrolPump class
	@Override
	public void run() 
	{
		try 
		{
			petrolPump.refillCar(Carname);  //it will call & pass the carName to PetrolPump class refillCar method
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}
}
