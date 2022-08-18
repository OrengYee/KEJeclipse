package projectA02;

public class projectA0205 {

	public static void main(String[] args) {
		char name1 = '강';
		char name2 = '은';
		char name3 = '지';
		System.out.println(name1+name2+name3);    // 이대로 선언하면 숫자로 나옴
		System.out.println(""+name1+name2+name3); // 앞에 "" 를 지정해야 문자열로 나옴 
		System.out.print(name1);
		System.out.print(name2);
		System.out.print(name3);
		System.out.println();
		
		String name = "강은지";
		System.out.println(name1+name2+name3); // 첫번째값이 숫자이므로 숫자출력.
		System.out.println(name);
		System.out.println(name+name1+name2+name3); // 첫번째 값이 문자열이므로 나머지 값은 문자로 출력됨.
		
		System.out.println(10+20+"안녕하세요");
		System.out.println("안녕하세요"+10+20); // 첫번째값이 문자이므로 , 나머지 값도 문자취급
		
		System.out.println(10+30+40+"HI");
		System.out.println("HI"+10+30+40);  // 첫번째값이 문자이므로 , 나머지 값도 문자취급
		System.out.println("HI"+(10+30+40)); // 첫번째 값이 문자지만 나머지 값을 따로 산수처리를 했으므로 수식이 계산됨.
		System.out.println(10+30+"HI"+40); //내가 생각한 값 :80+HI 
		System.out.println(10+30+"HI"+40*100); //4040 + HI 
		
		System.out.println("("+10+20+")");
		System.out.println((10+20));
		
		char c1 = '가';
		char c2 = '나';
		System.out.println(c1+c2);
		System.out.println(""+c1+c2);
		
		String str = 10+20+"안녕하세요";
		System.out.println(str);
		String str1 = "안녕하세요"+10+20;
		System.out.println(str1);
		
		System.out.println(10); // 10진수
		System.out.println(017); // 8진수
		System.out.println(0x1F); //16진수
		System.out.println(0b01010101010); //2진수
		
		char c = '\u0041';
		System.out.println(c);
		char cc = '\u0042';
		System.out.println(cc);
		char cc2 = '\uae00';
		System.out.println(cc2);
		
		String String1 = "안녕\t안녕하세요\t나는\n\"강은지\"입니다.";
		System.out.println(String1);
		String String2 = "안녕\b안녕하세요\t나는\'강은지\'입니다";
		System.out.println(String2);
		
		boolean b1 = true;
		boolean b2 = false;
		System.out.println(b1);
		System.out.println(b2);
		
		boolean b3 = (10>1);
		boolean b4 = (10==10);
		boolean b5 = (10<1);
		System.out.println(b3);
		System.out.println(b4);
		System.out.println(b5);
		
		String s1 = null;
		String s2 = "";
		int[] a1 = null;
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(a1);
		
	}

}
