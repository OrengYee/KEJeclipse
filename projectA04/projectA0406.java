package projectA04;

import java.util.Scanner;

public class projectA0406 {

	public static void main(String[] args) {
		int score =0;
		System.out.println("정수를 입력하세요.");
		
		Scanner in = new Scanner(System.in);
		
		score = in.nextInt();
		
		if(score > 80) {
			System.out.println("합격입니다.");
			return;
		}else if(score==80) {
			System.out.println("축하합니다.");
		}
		System.out.println("프로그램 종료");
		in.close();
				

	}

}
