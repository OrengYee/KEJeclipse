package projectA01;
/*
 * 
 * 개발자 : KEJ 강은지
 * 기능  : 합을 계산하기
 * 
 */

public class HelloWorldP {
	/*
	 * 
	 * parameter : n,m
	 * 기  능 : n과 m을 더하시오
	 * 
	 */
	public static int sum(int n,int m) {
		return n+m; // n+m의 합
	}

	public static void main(String[] args) {
		int i =20;
		int s;
		char a;
		s = sum(i,10);
		a = '?';
		System.out.println(a);
		System.out.println("Hello");
		System.out.println(s);
	}

}
