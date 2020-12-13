package chapter5;

public class StaticTest {
	static int a = 1;
	static int b;
	static {
		b = 5;
		System.out.println(a + b);
	}
	
	static void print() {
		System.out.println(a + b);
	}
	
	static {
		print();
	}
	public StaticTest() {
		System.out.println("this is a constructor");
	}
	public static void main(String[] args) {
		StaticTest spd = new StaticTest();
	}
}
