package projectA06;

import java.util.Scanner;

public class projectA0610 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("두 수를 입력하세요.:");
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		//두 수의 사잇수를 출력하시오
		int i;
		i=num1;
		while((i>=num1) && (i<=num2)){
			System.out.print(i+" ");
			i++;
		}
		System.out.println();
		int sum = 0;
		i=num1;
		//두 수의 합은
		while((i>=num1) && (i<=num2)) {
			sum = sum +i;
			i = i+1;
		}
		System.out.println("두 수 사이의 합:"+sum);
		//두 수 사이의 홀수의 합은
		sum =0;
		i=num1;
		while((i>=num1) && (i<=num2)) {
			if(i%2!=0) {
				sum = sum +i;
			}
			i++;
		}
		System.out.println("두 수 사이의 홀수의 합:"+sum);
		//두 수 사이의 짝수의 합은
		sum = 0;
		i = num1;
		while((i>=num1) && (i<=num2)) {
			if(i%2==0) {
				sum = sum +i;
			}
			i++;
		}
		System.out.println("두 수 사이의 짝수의 합:"+sum);
	}

}
