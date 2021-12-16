package com.method.of.function;

public class Methods_Basic {
//Methods are independent unit of execution. They have a certain logic, and they execute that logic under certain conditions
	//Design of method ==> access modifiers + static (optional) + returntype + name() {//logic}
	//static and non-static method 
	//type of methods ==> private, public, protected, default
	
	
	public static void main(String[] args) {

		int i= 10;
		int j =20;
		int k= i+j;
		//return k;
		
		test();
		 
		//classname + objectreference = object 
		Methods_Basic obj = new Methods_Basic ();   ///to call non static methods we have to object and than with help of obj we can call non static method 
		obj.test2();
		 
		System.out.println(test3());
		
		
		
	
		
		
		
	}
	
	public static void test() {
		System.out.println("This is test method");
	}
	
	public  void test2() {
		System.out.println("This is test 2 method ");
	int l=10;
	}
	 
	public static int test3(){
		System.out.println("this is test 3 method ");
		int aa=1;
		int bb=2;
		return aa;
		
	}
	
	
	
	
	
	

}
