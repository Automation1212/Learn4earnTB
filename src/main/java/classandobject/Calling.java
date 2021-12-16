package classandobject;

public class Calling {
//Global Variable 
	static String language = "Java";  //static Global Variable 
	 static int time =2;
	String complexity ="Medium";
	int Salary= 100000;
	
	    //static has the capability to call static stuff only. Static cannot call non-static
	    // non-static can call static as well as non-static stuff 
	
	
	public static void main(String[] args) {

		Calling calling = new Calling();
		//new Calling -this is the Object
		// calling - this is the object reference
		// Calling - this is the class
		
		System.out.println(calling.language);
		hello();
		Calling.hello();
	    calling.hello1();
	    calling.hello1();
	    calling.bye();   // non-static method, So we have to call it via object reference 
	}
	
public static void hello()	{
	int age = 20;
	String height ="Short";   // local variable because they are local to hello method and their operations' vicinity is within hello 
    Calling.language="fish";
    System.out.println(Calling.language);
    Calling.time=4;


}
	public void hello1() {
		int age =10;
		String height ="tall";
		System.out.println(age+" "+height);
	}
	public void bye() {  //non-static method 
		
	}
	
}
