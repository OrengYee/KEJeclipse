package projectA11;

class Student extends Person{
	private String work;

	public String getWork() {
		return work;
	}

	public void setWork(String work) {
		this.work = work;
	}
	public void sayAge() {
		int age = super.getAge();
		System.out.println("나이는 "+age+"입니다.");
	}
	
	@Override
	public String toString() {
		
		return "이름:"+super.name+" Part:"+this.part+" 하는일:"+this.work;
	}
	
}

class StudentWork extends Student{
	@Override
	public String toString() {		
		return super.toString();
	}
	
}


public class projectA1103 {

	public static void main(String[] args) {
		Person person = new Person();
		person.name = "강은지";
		person.part = "뿌직";
		
		Student student = new Student();
		student.name = "홍길동";
		student.part = "강사";
		student.setAge(30);
		student.setWork("공부");
		System.out.println(student);
		student.sayAge();
		System.out.println("--------------------");
		
		StudentWork studentwork = new StudentWork();
		studentwork.name = "홍홍홍";
		studentwork.part = "학생";
		studentwork.setAge(40);
		studentwork.setWork("무지직");
		System.out.println(studentwork);
		studentwork.sayAge();
		

	}

}
