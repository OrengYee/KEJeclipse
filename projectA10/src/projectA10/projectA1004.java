package projectA10;

public class projectA1004 {

	public static void main(String[] args) {
		
		System.out.println(Calculator.PI* 100);
		System.out.println(Calculator.plus(10,20));
		System.out.println(Calculator.minus(10,20));
		System.out.println("----------------------------------------------");
		
		//인스턴스화
		Calculator calc1 = new Calculator();
		Calculator calc2 = new Calculator();
		Calculator calc3 = new Calculator();
		Calculator calc4 = new Calculator();
		Calculator calc5 = new Calculator();
		
		//인스턴스 멤버 변수
		calc1.intValue = 10;
		calc2.intValue = 20;
		calc3.intValue = 30;
		calc4.intValue = 40;
		calc5.intValue = 50;
		
		System.out.println("calc1:"+calc1.intValue);
		System.out.println("calc2:"+calc2.intValue);
		System.out.println("calc3:"+calc3.intValue);
		System.out.println("calc4:"+calc4.intValue);
		System.out.println("calc5:"+calc5.intValue);
		System.out.println("----------------------------------------------");
		System.out.println("calc1 PI:"+calc1.PI);
		System.out.println("calc2 PI:"+calc2.PI);
		System.out.println("calc3 PI:"+calc3.PI);
		System.out.println("calc4 PI:"+calc4.PI);
		System.out.println("calc5 PI:"+calc5.PI);
		
		

	}

}
