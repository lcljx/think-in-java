package chapter5;

public class ConstructTest {
	public static void main(String[] args) {
		Test t = new Test("55");
		System.out.println(t.a);
		System.out.println(t.bbb);
		
		byte a = 5;
		byte b = 6;
		t.f(5, 6);
	}
}

class Test {
	String a;
	String bbb;
	public Test(String bbb) {
		this.bbb = bbb;
	}
	
	public void f(byte a, byte b) {
		System.out.println("byte");
	}
	
	public void f(short a, short b) {
		System.out.println("short");
	}
	
	public void f(int a, int b) {
		System.out.println("int");
	}
}