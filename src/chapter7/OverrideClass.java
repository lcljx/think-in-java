package chapter7;

class Basic {
	void print() {
		System.out.println("no params");
	}
	
	void print(int i) {
		System.out.println("i params");
	}
	
	void print(float i) {
		System.out.println("f params");
	}
}

public class OverrideClass extends Basic {
	@Override
	void print (int i) {
		System.out.println("sub i");
	}
	
	void print(long i) {
		System.out.println("l params");
	}
	public static void main(String[] args) {
		OverrideClass o = new OverrideClass();
		o.print(5);
		o.print(10L);
	}
}
