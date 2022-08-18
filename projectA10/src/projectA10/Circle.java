package projectA10;

public class Circle {
	//멤버 변수
	int radius;
	String name;
	
	//생성자 디폴터 생성자
	public Circle() {
		this.radius=1;
		this.name="";
	}
	//생성자 파라메타 2개인 생성자
	public Circle(int r,String n) {
		this.radius = r;
		this.name = n;
	}
	//멤버 메소드
	public double getArea() {
		return 3.14*radius*radius;
	}

	public static void main(String[] args) {
		//인스턴스화
		Circle pizza = new Circle(10,"페페로니 피자"); //생성자를 호출
		
		//멤버 메소드 호출
		double area = pizza.getArea(); //면적을 구함
		System.out.println(pizza.name+"의 면적은 "+area);
		
		//인스턴스화
		Circle donut = new Circle(); //default 생성자를 호출
		donut.name = "도넛피자";
		//멤버 메소드 호출
		area  = donut.getArea();
		System.out.println(donut.name+"의 면적은 "+area);

	}

}
