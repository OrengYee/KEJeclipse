package projectA07;

public class projectA0705 {

	public static void main(String[] args) {
		int i;
		
		int sum=0;
		
		for(i=0;i<=1_000_000;i++) {
			sum = sum+i;
		}
		System.out.println("0~1_000_000까지의 합은:"+sum);
		//while,do-while
		
		/*while(i<=1000000) {
			System.out.println(sum);
		}
		i++;
		
		do {
			System.out.println(sum);
			i++;
		}while(i<=1000000){
		break;*/
		
		i=0;
		sum=0;
		while(i<=1000000) {
			sum=sum+i;
			i++;
		}
		System.out.println("0~1_000_000까지의 합은:"+sum);
		
		i=0;
		sum=0;
		do {
			sum=sum+i;
			i++;
		}while(i<=1_000_000);
		System.out.println("0~1_000_000까지의 합은:"+sum);
	}

}
