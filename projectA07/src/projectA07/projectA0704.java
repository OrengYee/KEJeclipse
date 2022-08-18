package projectA07;

public class projectA0704 {

	public static void main(String[] args) {
		// 짝수
		int i=0;
		for(;;) {
			System.out.println(i+"->"+"짝수입니다.");
			i=i+2;
			if(i>=102) {
				break;
			}
		}
		System.out.println();
		i=0;
		while(true) {
			System.out.println(i+"->"+"짝수입니다.");
			i=i+2;
			if(i>=102) {
				break;
			}
		}
		System.out.println();
		i=0;
		do {
			System.out.println(i+"->"+"짝수입니다.");
		    i=i+2;
		}while(i<=100);
				
	}
	
}
	


