package chapter7;

class Test {
	public Test() {
		System.out.println("constructed");
	}
	
	void print() {
		System.out.println("print");
	}
}
public class Pratice1 {
	private Test test;
	public String toString() {
		if (test == null) {
			test = new Test();
		}
		return test.toString();
	}
	public static void main(String[] args) {
		Pratice1 p = new Pratice1();
		System.out.println(p);
	}
}
