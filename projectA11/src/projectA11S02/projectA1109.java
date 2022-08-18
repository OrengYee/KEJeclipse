package projectA11S02;

class Person{
	String name;
	String id;
	public Person(String name) {
		this.name = name;
	}
	
}

class Student extends Person {
	String grade;
	String department;
	public Student(String name) {
		super(name);
	}
}

public class projectA1109 {

	public static void main(String[] args) {
		Person p;
		Student s = new Student("강은지");
		p = s; //upcast
		
		System.out.println(p.name);
		
		Person p1 = new Student("강태원");
		Student s1;
		
		s1 = (Student)p1; //downcast
		s1.grade = "A";
		s1.department  = "컴뷰터 공학";
		System.out.println(s1.name);
		

	}

}
