package com.method.of.function;

public class Overloading {

	public static void main(String[] args) {
// why is main method static ??
// The class Overloading need not create Object of the main method
// in otherwords class need to 	make oject of call any non-static menthod so inn case of main if it is static thn class can call it directly.
		
		
		// what is method overloading??
		// whenever a method with the same name is loaded with extra parameters
		
		// Can main method be overloaded?? ans_- Yess
		
		Overloading overloading= new Overloading ();
		overloading.test();
		overloading.test(100);
		overloading.test(10,20);
		main(1);
		
		
		
		
		
		
		
	}

	public static void main(int i) {
		System.out.println("this is the overloaded main method "); 
	int ii =3;
		
		
	}
	public void test () {
		System.out.println("This is a non-overloaded method");
	}
	public void test(int i) {
		System.out.println("This is non-static overloaded method with single parameter ");
		
	}
	
	public void test (int j, int k) {
		System.out.println("this is non-static overloaded method with two paramenters");
	}
	
	
	
}
