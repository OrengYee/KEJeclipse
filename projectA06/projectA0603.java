package projectA06;

public class projectA0603 {

	public static void main(String[] args) {
		System.out.print("0에서 9까지:");
		int i=0;
		
		while(i<10) {
			System.out.print(i+" ");
			i++;
		}
		System.out.println();
		
//		System.out.print("0에서 100까지:");
		int ia=0;
		while(true) {
			System.out.print(ia+" ");
			
			if(ia == 100) {
				break;
			}
			System.out.print(ia+" "); //위치에 따라서 값이 달라짐. 중괄호 위치의 중요성 
			ia++;
		}
		System.out.println();

	}

}
