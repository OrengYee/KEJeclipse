package projectA07;

import java.util.Scanner;

public class projectA0719 {

	public static void main(String[] args) {
		float[] student = new float[3];
		Scanner in = new Scanner(System.in);
		
		
		for(int i=0;i<student.length;i++) {
			System.out.println("점수를 입력하세요.소숫점 2자리까지:");
			student[i] = Float.parseFloat(in.nextLine());
		}
		
		float sum = 0;
		float avg = 0;
		//평균을 계산하시오
		for(int i=0;i<student.length;i++) {
			sum = sum + student[i];
		}
		
		avg = sum/student.length;
		System.out.println("평균은:"+avg);

	}

}
