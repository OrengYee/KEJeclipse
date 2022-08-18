package projectA13;

interface Calculatable {
	public int sum();
}

class GoodClas {
	private int field=10;
	public void method(int ... value) {
		
		Calculatable calc = new Calculatable() {
			
			@Override
			public int sum() {
				int sum = 0;
				for(int i:value) {
					sum = sum + i ;
				}
				return sum + field;
			}
		};
		
		System.out.println(calc.sum());
		
	} 
	

	public void method2(int[] value) {
		Calculatable calc = new Calculatable() {
		
					@Override
					public int sum() {
						int sum = 0;
						for(int i:value) {
							sum = sum + i ;
						}
						return sum+field;
					}
				};
				
		           System.out.println(calc.sum());
			
	           
           };
		
	}	

public class projectA1309 {

	public static void main(String[] args) {
		GoodClas gcals = new GoodClas();
		gcals.method(1,2,3,4,5,6,7,8,9,10);
		gcals.method2(new int[] {1,2,3,4,5,6,7,8,9,10});
				

	}

}





	
	
	
