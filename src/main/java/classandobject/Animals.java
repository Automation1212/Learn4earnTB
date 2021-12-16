package classandobject;

public class Animals {

	public static void main(String[] args) {

Animals romeo = new Animals();
Birds birds = new Birds();
Vehicles vehicles = new Vehicles();

birds.fly();
birds.speaks();

 

		
		
		
	}
	public void eating () {
		System.out.println("Romeo eats");
	}
	public void barking() {
		System.out.println("Romeo bark");
	}

}

class Birds{
	public  void fly() {
		System.out.println("Moti is flying");
	}
	
	
	void speaks() {
		System.out.println("Moti is speaking");
	}
}

class Vehicles{
	void truckDrive() {
		System.out.println("Truck Drives");
	
	}
	
	void carDrive() {
		System.out.println("Car Drive");
	}
}



