package projectA05;

public class projectA0511 {

	public static void main(String[] args) {
		int sum1 = 0; //짝수합
		int sum2 = 0; //홀수합
		
		for(int i=1;i<=100;i++) {
			if(i%2==0) {
				sum1=sum1+i; //짝수		
	        }
			if(i%2!=0) {
				sum2=sum2+1; //홀수
			}
			
		}
			System.out.println("짝수합은:"+sum1);
			System.out.println("홀수합은:"+sum2);

		
	}
}

/*
 * 
 *  { } 의 위치의 소중함을 알았다 
 *  
 */

/*
        int sum1 = 0; //짝수합
        int sum2 = 0; //홀수합
		
		for(int i=1;i<=100;i++) {
			if(i%2==0) {
				sum1=sum1+i; //짝수		
	        }
			if(i%2!=0) {
				sum2=sum2+1; //홀수
			}
			
		
			System.out.println("짝수합은:"+sum1);
			System.out.println("홀수합은:"+sum2);
			
			}
			}
			}
			
			..으로 코딩했더니, 계산히 무수히 반복되었다.
 */


	



