package projectA04;

import java.util.Scanner;

public class projectA0413 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("점수를 입력하시오(0~100) : ");
		int score = in.nextInt();
		System.out.println("학년을 입력하시오(1~4) : ");
		int year = in.nextInt();
		
		if(score >= 60) {
			if(year!=4) {
				System.out.println("합격");
			}else if(score>=70){ // 1,2,3
		}
	}else {
		System.out.println("불합격");
	}

}
	
}
