package Dec_24_PetrolPump;

public class PetrolPumpSimulation
{
	public static void main(String[] args) throws InterruptedException 
	{
		PetrolPump petrolPump = new PetrolPump();  //Create an Object of PetrolPump class
		
		//Car class array to take multiple cars at a time.
		Car[] cars = { 
						new Car("Skoda", petrolPump), 
						new Car("Volkswagen",petrolPump),
						new Car("Tata", petrolPump),
						new Car("Audi", petrolPump),
						new Car("BMW", petrolPump)
				    };
		
		//Create an multiple threads in single line with the help of cars.length
		Thread[] carThread = new Thread[cars.length];    
		for(int i=0; i<cars.length; i++)
		{
			carThread[i] = new Thread(cars[i]);  //Here we're passing cars
			carThread[i].start();                //Here Thread will be start.
		}
		
		for(int i=0; i<cars.length; i++)
		{
			carThread[i].join();            //With the help of join we can pass cars for one by one execution completion.
			Thread.sleep(1000);             //After all cars are Thread is in waiting state for 1sec and print All cars are completed refilling.
		}
		System.out.println("\nAll cars are completed refilling.");
	}

}
