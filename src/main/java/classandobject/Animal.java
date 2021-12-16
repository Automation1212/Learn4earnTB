package classandobject;

public class Animal {
	//What is class==> Class is kind of template which describe the state and the behavior of an Object which it supports
			//		==>Class is a logical form
			//		==> Class represents set of properties that are common to all objects of one type 
	 
	
	// What is an object ==> Object is instance of a class
	 			//		==> Identy + State(S) + Behavior(S)
				//		==> Object is (Logical + Physical) Form
				//     ==> Categorization is simpler compared to a Class
	
	//An object Dog [name + eating/barking/sleeping/swiming/ + Breed/Color/Age]
	
	String name = "Romeo";  //identity
	int age = 9;
	String color ="Fawn";  //states
	String breed= "Labrador";
	
	 
	
	public static void main(String[] args) {
// Class and Object an integral part in OOPs  (object Orientated Program)
		
		//way of creating an Object in Java 
		//1. by using new keyword
		
		
		new Animal ();   //whenever we use new keyword to create an Object, we instantiating the CLass
		Animal animal = new Animal();    // this is how it is represented 
		Animal animal1 = new Animal();
		
		animal1.name= "Honey";
		animal1.age= 1;
		animal1.color= "black";
		animal1.breed= "Spitz";

		
		System.out.println(animal1.name);
		System.out.println(animal1.age);
		System.out.println(animal1.color);
		System.out.println(animal1.breed);
		
		System.out.println("*************************************");

		animal=animal1;   //changing reference 
		
			

			System.out.println(animal.name);
			System.out.println(animal.age);
			System.out.println(animal.color);
			System.out.println(animal.breed);
 		
			
			
			
			
	}

	
	
	
	
	
	
	
	
}
