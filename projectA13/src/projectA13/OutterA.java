package projectA13;

public class OutterA {
	String field = "OutterA-field";
	void method() {
		System.out.println();
	}
	
	class Nested {
		String field = "Nested-field";
		void method() {
			System.out.println("Nested-field");
		}
		void print() {
			System.out.println(this.field);
			this.method();
			System.out.println(OutterA.this.field);
			OutterA.this.method();
		}
	}

}
