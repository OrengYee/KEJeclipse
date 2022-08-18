package projectA05;

import java.util.Scanner;

public class projectA0503 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("메뉴를 입력하세요:");
		System.out.println("1.아메리카노 2.얼그레이 3.스무디");
		System.out.println("1,2,3중에 입력 하세요.");
		
		int menu = in.nextInt();
		
		switch(menu) {
		case 1:
			System.out.println("아메리카노는 2000원 입니다.");
			break;
		case 2:
			System.out.println("얼그레이는 3000원 입니다.");
			break;
		case 3:
			System.out.println("스무디는 3500원 입니다.");
			break;
			default:
			System.out.println("메뉴에 없습니다.");
			break;
				
		}
		in.close();
		
		

	}

}
