package classandobject;

public class Constructor_Concepts {

	public static void main(String[] args) {
   //what is Constructor
		//It is a block to a method having the same name as of class
		//Constructor does not have return type even void 
		// Modifiers - public, protected, default and private 
		// invoked- automatically when we create an Object 
		// By default compiler will create a  Constructor  when we create object
		// when we create a constructor the deafult constructor (which we cannt see) will vanished 
		
		
		// Use of a constructor - to initialize an object
		// constructor only initialize the object dont create object 
		//   "new" word create object 
		
		
		
		// There are thre type of Constructor 
		//1. default constructor created by the compiler . No argument  
		//2. User defined Constructor. No argument 
		//3. Parameterized Constructor. user defined 
		
		
		Constructor_Concepts obj= new Constructor_Concepts();
		
		
		
		
		
	}
	
	public Constructor_Concepts() {
		
	}
	
	
	
	///for creating multiple constructor we have to parameterized tye constructor by puting varoius data type 
	//every time we crate other construstor we have to change the data tyoe or add more data it will not work by just changing name 
	//consept video in 9 lecture time 50 min
	// for examples are given below 
	 
public Constructor_Concepts(String a, int i ) {
		
	}
public Constructor_Concepts(String b, int i, int k) {
	
}

}
