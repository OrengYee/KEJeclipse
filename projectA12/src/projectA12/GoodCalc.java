package projectA12;

public class GoodCalc extends Calculatior {

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public int subtract(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public double average(int[] a) {
		double sum = 0;
		for(int i=0;i<a.length;i++) {
			sum = sum+a[i];
		}
		
		
		return sum/a.length;
	}

}
