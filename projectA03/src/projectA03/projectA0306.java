package projectA03;

public class projectA0306 {

	public static void main(String[] args) {
		//++ -- 
		int x = 10;
		int xr = x++; // xr=10 , x=11
		xr = ++x;     // x=12 xr=12
		
		int result = x+10+xr;
		
		result = x-10-xr;
		
		result = x*10*xr;
		
		result = x+xr*10;
		
		result = x-xr/10;
		
		result = x/10;
		result = x*10;
		result = x%10;
		
		x = 10;
		result = (x++) + 10;
		System.out.println(result);
		x = 10;
		result = ++x + 10;
		System.out.println(result);
		
		x = 10;  // 추천식 
		result = (x+1) + 10;
		System.out.println(result);
		
		int sx = 0x01;
		System.out.println(sx<<1);
		System.out.println(sx<<2);
		System.out.println(sx<<3);
		System.out.println(sx<<4);
		System.out.println();
		
		int sx1 = 0x10;
		System.out.println(sx1);
		System.out.println(sx1>>1);
		System.out.println(sx1>>2);
		System.out.println();
		
		int fx = 10;
		int fy = 20;
		System.out.println(fx>fy);
		if(fx>fx) {
			System.out.println("fx>fy");
		}
		System.out.println(fx<fy);
		
		fx=11;
		fy=11;
		System.out.println(fx==fy);
		
		fx=10;
		fy=20;
		System.out.println(fx>=fy);
		
		fy=20;
		System.out.println(fx<=fy);
		
		
		

	}

}
