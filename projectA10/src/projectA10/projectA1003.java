package projectA10;

public class projectA1003 {
	
	static void sumArray(int[] array) {
		
		int sum=0;
		for(int i:array) {
			sum = sum+i;
		}
		System.out.println("합은:"+sum);
	}
	static void sumParameter(int...params) {
		int sum=0;
		for(int i:params) {
			sum = sum+i;
		}
		System.out.println("params의 합은:"+sum);
	}

	public static void main(String[] args) {
		sumArray(new int[] {1,2,3,4,5,6,7,8,9,10});
		
		sumParameter(1,2,3,4,5,6,7,8,9,10);

	}

}
