package projectA09S03;

public class projectA0915 {

	public static void main(String[] args) {
		//인스턴스화
		Calculator myClac = new Calculator();
		
		//정사각형의 넓이 구하기
		double result1 = myClac.areaRectangle(10);
		
		//직사각형의 넓이 구하기
		double result2 = myClac.areaRectangle(10,20);
		
		System.out.println("정사각형의 넓이:"+result1);
		System.out.println("직사각형의 넓이:"+result2);

	}

}
