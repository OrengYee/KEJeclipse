package projectA10;

import java.util.Scanner;

public class App2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		Person person1 = new Person("김태민");
		person1.Info();
		System.out.println();
		
		Person person2 = new Person("장길산",30,"산지기");
		person2.Info();
		System.out.println();
		
		Person[] personModel = new Person [3];
		int i=0;
		while(i<personModel.length) {
			
			//인스턴스화
			personModel[i] = new Person();
			System.out.println("이름:");
			personModel[i].setName(in.nextLine());
			System.out.println("나이:");
			personModel[i].setAge(Integer.parseInt(in.nextLine()));
			System.out.println("직업:");
			personModel[i].setJob(in.nextLine());		
			
			
			i++;
		}
		i=0;
		while(i<personModel.length) {
			personModel[i].Info();
			i++;
			System.out.println();
		}
		
		
		

	}

}
