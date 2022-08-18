package projectA02;

public class projectA0201 {
	
	public static void main(String[] args) {
		int myBirthYear = 1994;
		int 내출생년도     = 1994;
		int intValue   = 1000; // @와 같은 특수문자 사용 불가능.  _ $ 은 사용가능. 숫자도 첫번째 문자로 사용불가능
		System.out.println(myBirthYear);
		System.out.println(내출생년도);
		System.out.println(intValue);
		
		int intdata = 2147483647;
		System.out.println(intdata);
		
		byte byteval = 127;
		System.out.println(byteval);
		byte byteval1 = -128;
		System.out.println(byteval1);
		float floatval = 1.12f; // float 와 double을 구분하기 위해 float값에 f를 붙여줌.
		System.out.println(floatval+" float"); 
		double doubleval = 1.12;
		System.out.println(doubleval+" double");
		
		//정수는 int 소수는 double로 저장이됨
		
		//상수
		final double PI = 3.14;
		System.out.println(PI);
		
		short shortval = 32767;
		System.out.println(shortval);
		
	
		
		
	}

}
