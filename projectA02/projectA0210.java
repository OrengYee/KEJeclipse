package projectA02;

public class projectA0210 {

	public static void main(String[] args) {
		int inc = 10;
		int inb = ++inc;
		System.out.println("inc="+inc+" inb="+inb);
		System.out.println();
		
		inb = inc++;
		System.out.println("inc="+inc+" inb="+inb);
		
		int ind = 10;
		int ind1 = --ind;
		System.out.println("ind="+ind+" ind1="+ind1);
		ind1 = ind--;
		System.out.println("ind="+ind+" ind1="+ind1);
		System.out.println();
		
		inc = 10;
		inb = inc++;
		System.out.println("inc="+inc+" inb="+inb);
		inb = ++inc;
		System.out.println("inc="+inc+" inb="+inb);
		System.out.println();
		
		ind = 10;
		ind1 = ind--;
		System.out.println("ind1="+ind1+" ind="+ind);
		ind1 = --ind;
		System.out.println("ind1="+ind1+" ind="+ind);
		
	}

}
