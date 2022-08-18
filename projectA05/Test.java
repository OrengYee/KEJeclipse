package projectA05;

public class Test {

	
	public static void main(String[] args) {
		 int sum1 = 0; //짝수합
	     int sum2 = 0; //홀수합
			
			for(int i=1;i<=100;i++) {
				if(i%2==0) {
					sum1=sum1+i; //짝수		
		        }
				if(i%2!=0) {
					sum2=sum2+i; //홀수
				}
				
			
				System.out.println("짝수합은:"+sum1);
				System.out.println("홀수합은:"+sum2);
				
			}
		}
				
	}

/*
 *  {} 위치에 따라 계산 오류가 난다
 *  projectA0512-13
 *  
 */

