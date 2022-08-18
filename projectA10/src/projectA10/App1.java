package projectA10;

import java.util.Scanner;

public class App1 {

	public static void main(String[] args) {
		//인스턴스화 배열로 생성
		Student[] students = new Student[5];
		
		//표준입력으로 입력을 받기위해 생성
		Scanner in = new Scanner(System.in);
		
		for(int i=0;i<students.length;i++) {
			//배열을 인스턴스화
			students[i] = new Student();
			
			System.out.println("이름:");
			//한줄로 입력 받는다
			String name = in.nextLine();
			//입력 받은 값을 멤버 메소드를 사용하여 설정한다 : 이름지정
			students[i].setName(name);
			
			System.out.println("국어점수:");					
			String kor = in.nextLine();			
			students[i].setKor(Integer.parseInt(kor));
			
			System.out.println("영어점수:");			
			String eng = in.nextLine();
			students[i].setEng(Integer.parseInt(eng));
			
			System.out.println("수학점수:");
			String math = in.nextLine();
			students[i].setMath(Integer.parseInt(math));
			
			
		}
		
		for(int i=0;i<students.length;i++) {
			System.out.println("이름:"+students[i].getName());    //인스턴스 멤버 메소드를 사용하여 Name을 가져온다.
			System.out.println("국어점수:"+students[i].getKor());  //인스턴스 멤버 메소드를 사용하여 Kor을 가져온다.
			System.out.println("영어점수:"+students[i].getEng());  //인스턴스 멤버 메소드를 사용하여 Eng을 가져온다.
			System.out.println("수학점수:"+students[i].getMath()); //인스턴스 멤버 메소드를 사용하여 Math을 가져온다.
			System.out.println();
		
		}

	}

}
