package projectA04;

public class projectA0415 {

	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int c = 2;
		int d = 1;
		
		if((a+b)==(c+d)) {
			System.out.println("두 수의 합이 같다.");
		}else {
			System.out.println("두 수의 합이 다르다");
		}
		
		if('A' == 'B') {
			System.out.println("같은 문자 입니다.");
		}else if('A' == 'A') {
			System.out.println("같은 문자 입니다.");

	}
	
	if("test" == "test") {
		System.out.println("문자열이 같습니다.");
	}
	
	if("test".equals("test")) {
		System.out.println("문자열이 같습니다.");
	}
	
	String str = "ABCE";
	
	if(str.equals("ABCE")) {
		System.out.println("문자열이 같습니다.");
	}

}
}

