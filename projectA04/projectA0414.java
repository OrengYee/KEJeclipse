package projectA04;

import java.util.Scanner;

public class projectA0414 {

	public static void main(String[] args) {
		System.out.println("점수를 입력하세요:");
		
		String grade; // 문자열
		
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		/* 
		 * 100 ~ 95 A++
		 * 94 ~ 90 A
		 * 89 ~ 85 B++
		 * 84 ~ 80 B
		 * c
		 */
		
		if(num <=100 && num >=95) {
			grade = "A++";
		}else if(num < 95 && num >=90) {
			grade = "A";
		}else if(num < 89 && num >=85) {
			grade = "B++";
		}else if(num < 84 && num >=80) {
			grade = "B";
		}else {
			grade = "C";
	}
		System.out.println("당신의 학점은: "+grade);
	    in.close();
}
}
