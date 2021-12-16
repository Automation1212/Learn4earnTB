package classandobject;

public class Initialize_Object {
	
	String color;
	int age;
	int agge;
	

	public static void main(String[] args) {

		// we can intialize object by
		//1. By reference variable
		//2. By methods
		//3. By constructor    explained in new class namely- Constructor_Concepts
		
		
		Initialize_Object romeo = new Initialize_Object();
		
		romeo.color = "Black";
		romeo.age =1;
		System.out.println(romeo.color);
		System.out.println(romeo.age);
		 
		
		
		romeo.initObject("Brown", 5);
		
		romeo.display();
		
		
	}
	
	
	public void initObject(String c, int a) {
		color=c;
		age=a;
		System.out.println(a);
		System.out.println(c);
	}
	
	
	void display(){
		 
		color= "white";
		
		age =15;
		
		System.out.println(color);
		System.out.println(age);
	}
	

}
