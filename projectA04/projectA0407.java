package projectA04;

import java.util.Scanner;

public class projectA0407 {

	public static void main(String[] args) {
		/*
		 * 
		 *  int 정수를 입력받아 짝수인지 홀수인지를 출력
		 *  number%2 == 0 짝수 number%2!=0 홀수
		 * 
		 */
		
		int number = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("정수를 하나 입력하세요.");
		number = in.nextInt();
		
		if(number%2 == 0) {
			System.out.println(number+"는 짝수입니다.");
		}else {
			System.out.println(number+"는 홀수입니다.");
		}
		
		if(number%2 == 0) {
			System.out.println(number+"는 짝수입니다.");
		}else if(number%2 != 0){
			System.out.println(number+"는 홀수입니다.");
		}

	}

}
