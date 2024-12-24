package Dec_24_PetrolPump;

public class PetrolPump 
{
	/*Method to refilling the car with the help of parameter carName and 
	when it will be refilling then the current thread is in waiting state for 3 second*/
	
	public synchronized void refillCar(String carName) throws InterruptedException
	{
		System.out.println();
		System.out.println(carName +" started refilling...");
		try
		{
			System.out.println("Please wait... car is under refilling process.");
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println(carName +" completed refilling.");
	}
}
