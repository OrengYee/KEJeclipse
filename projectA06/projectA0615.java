package projectA06;

import java.util.Scanner;

public class projectA0615 {

	public static void main(String[] args) {
		
		System.out.println("첫번째 수를 입력하세요.");
		
		Scanner in = new Scanner(System.in);
		int num1 = Integer.parseInt(in.nextLine());
		System.out.println("두번째 수를 입력하세요.");
		int num2 = Integer.parseInt(in.nextLine());
		
		int i;
		i = num1;
		
		do {
			System.out.print(i+" ");
			i++;
		}while((i>=num1) && (i<=num2));
		System.out.println();
		
		//두 수 사이의 홀수의 합을 구하시오
		
		/*i = num1;
		int sum = 0;
		
		if(i%2!=0) {
			sum = sum+i;
			do {
			}while((i>=num1) && (i<=num2));
			System.out.println();
		}System.out.println("두 수 사이의 홀수의 합은:"+sum); */
		
		// 계산순서를 잘 맞춰야함 !
		
		i = num1;
		int sum = 0;
		do {
			if(i%2 != 0) {
				sum = sum+i;
			}
			i++;
		}while((i>=num1) && (i<=num2));
		System.out.println("두 수 사이의 홀수의 합은:"+sum);
		
		// 두 수 사이의 짝수의 합을 구하시오
		
		i = num1;
		sum = 0;
		do {
			if(i%2 == 0) {
				sum = sum+i;
			}
			i++;
		}while((i>=num1) && (i<=num2));
		System.out.println("두 수 사이의 짝수의 합은:"+sum);
		
		//중괄호 위치 짱짱 중요함
		
	}
	

}
