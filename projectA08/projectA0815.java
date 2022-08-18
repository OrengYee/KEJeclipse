package projectA08;

public class projectA0815 {
	
	static Object[] makeObj() {
		Object[] Obj = new Object[5];
		
		Obj[0] = 10;
		Obj[1] = 3.14;
		Obj[2] = "Java";
		Obj[3] = 1000;
		Obj[4] = new String("programming");
		
		return Obj;
	}

	public static void main(String[] args) {
		Object[] Obj = makeObj();
		
		int intValue =(int) Obj[0];
		double doubleValue = (double)Obj[1];
		String str1 = (String)Obj[2];
		int intValue2 = (int)Obj[3];
		String str2 = (String)Obj[4];
		
		System.out.println(intValue+" "+doubleValue+" "+str1+" "+intValue2+" "+str2);

	}

}
