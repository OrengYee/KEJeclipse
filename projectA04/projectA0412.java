package projectA04;

import java.util.Scanner;

public class projectA0412 {

	public static void main(String[] args) {
		String grade;
		Scanner in = new Scanner(System.in);
		
		System.out.println("점수를 입력하시오 : ");
		
		int score = in.nextInt();
		
		if(score <=100 && score >= 95) {
			grade = "A++";
		}else if(score <=94 && score >=90) {
			grade = "A";
	    }else if(score <90 && score >=85) {
		    grade = "B++";
        }else if(score <85 && score >=80) {
	        grade = "B";
        }else if(score <70 && score >=75) {
	        grade = "C++";
        }else if(score >= 70) {
	        grade = "C";
        }else if(score >= 60) {
	        grade = "D";
        }else {
	        grade = "F";
        }
	     System.out.println("당신의 학점은: "+grade);
	     in.close();
		
		
		
		
		
		/*if(score >= 90) {
			grade = "A";
		}else if(score >= 80) {
			grade = "B";
		}else if(score >= 70) {
			grade = "C";
		}else if(score >= 60) {
			grade = "D";
		}else {
			grade = "E";
		}
		System.out.println("당신의 학점은: "+grade);
		*/in.close();
				
		

	}

}
	

