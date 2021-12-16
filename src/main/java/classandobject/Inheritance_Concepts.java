package classandobject;


public class Inheritance_Concepts {

	public static void main(String[] args) {

		Child child = new Child();
        child.money();
        child.bunglow();
        
        
   //in order to use other class or call other class we have to use 
   // word "extends" as shown in Child class all the way below 
   // After that we have to create the object of that class as we did for the child class 
        
		
		 
	}
	public void money () {
		System.out.println("Parent's money");
	}
	
	public void bunglow() {
		System.out.println("Parent's bunglow");
	}

	
	
}

class Child extends Inheritance_Concepts {
	
}
