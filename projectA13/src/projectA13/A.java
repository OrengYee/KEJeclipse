package projectA13;

public class A {
	A(){
		System.out.println("A객체가 생성된");
	}
	
	//인스턴스 멤버 클래스
	public class B{
		B(){
			System.out.println("B객체가 생성된");
		
	}
		int field1;
		void method1() {
			
		}

}
	//클래스 멤버 클래스
	static class C{
		C(){
			System.out.println("C객체가 생성됨");
			
		}
		int field1;
		static int field2;
		void method1() {
	}
		 static void method2() {
	}
	}
	
	void method() {
		//로컬 클래스
		class D{
			D(){
				System.out.println("D객체가 생성됨");
			}
			int field1;
			void method1() {
			
		}
	}
		D d = new D();
		d.field1 =3;
		d.method1();
	
}
	
}