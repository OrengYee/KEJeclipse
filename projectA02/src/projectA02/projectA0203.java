package projectA02;

public class projectA0203 {

	public static void main(String[] args) {
		int sum = 10+20; // int + int
		int value = 10;  // int >> int 
		
		int value1 = sum + value; // int + int 
		System.out.println(value1);
		System.out.println(" ");
		
		long sum1 = (long)(10L+10L+10L+10L+10L+10L+10L+10L+2147483648L);
		long sum2 = (long)(10+10+10+10+10+10+10+10+2147483647);
		long sum3 = (long)(10L+10L+10L+10+10+10+10+10+2147483647);
		long sum4 = (long)(2147483647+10L+10L+10L+10+10+10+10+10);
		
		int sum5  = (10+10+10+10+10+10+10+10+2147483647);
		
		System.out.println("sum1: "+sum1);
		System.out.println("sum2: "+sum2);
		System.out.println("sum3: "+sum3);
		System.out.println("sum4: "+sum4);
		System.out.println("sum5: "+sum5);

	}

}
