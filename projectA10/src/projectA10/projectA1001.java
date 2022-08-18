package projectA10;

public class projectA1001 {

	public static void main(String[] args) {
		//인스턴스화
		Circle bendeddk = new Circle(10,"빈대떡"); //생성자를 호출
		
		//멤버 메소드 호출 크기를 구함
		double area = bendeddk.getArea();
		System.out.println(bendeddk.name+"의 면적은 "+bendeddk.getArea());
		
		Circle pizza = new Circle(20,"새우 피자"); //생성자를 호출		
		//멤버 메소드를 호출 크기를 구함
		double area_pizza = pizza.getArea();
		System.out.println(pizza.name+"의 면적은 "+pizza.getArea());
		
		// pizza.name = "고래피자";
		
		

	}

}
