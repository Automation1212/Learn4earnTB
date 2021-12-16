package classandobject;

public class Student {

	String name ;
	int student_id;
	int age ;
	
	public static void main(String[] args) {

		Student st1 = new Student("Rohit", 101,11);
		
		Student st2 = new Student ("Rahul", 102, 12);
		
		System.out.println(st1.name+" "+ st1.student_id+" "+st1.age);
		System.out.println(st2.name+" "+ st2.student_id+" "+st2.age);
	}
	
	public Student(String name, int student_id, int age) {
		this.name=name;
		this.student_id= student_id;
		this.age= 2;
		
	
		
		
	}

}
