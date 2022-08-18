package projectA13;

public class Outter {
	
	//java 8 이전
	public void method1(final int arg) {
		final int localVariable = 1;
		
		class Inner{
			public void method() {
				int result = arg+localVariable;
				
			}
		}
	}
	
	//java 8 이후
	
	
		public void method2(final int arg) {
			int localVariable = 1;
			
			class Inner{
				public void method() {
					int result = arg+localVariable;
					
				}
			}
		}

}
