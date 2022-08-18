package projectA03;

public class projectA0301 {

	public static void main(String[] args) {
		boolean b1 = false;
		//boolean b2 = 1; // boolean 은 참과 거짓만 가짐 .
		
		byte bt1 = 10;
		int i1 = 20;
		
		bt1 =(byte) i1;
		i1 = bt1;
		
		int var1 = 10;  //10진수
		int var2 = 010; //8진수
		int var3 = 0x10;//16진수
		int var4 = 0b0010;
		
		System.out.println("var1: "+var1);
		System.out.println("var2: "+var2);
		System.out.println("var3: "+var3);
		System.out.println("var4: "+var4);
		System.out.println(Integer.toBinaryString(var4));
		
		int result = 0;
		result = var1+var2+var3+var4;
		System.out.println(result);
		

	}

}
