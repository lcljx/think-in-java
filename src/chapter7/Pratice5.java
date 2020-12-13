package chapter7;
class A {
	int i = 5;
	
	public A() {
		System.out.println(i);
	}
	public A(float i) {
		System.out.println(i);
	}
}
class B {
	public B() {
		// TODO Auto-generated constructor stub
	}
}
public class Pratice5 extends A {
	public Pratice5() {
		super(0);
	}
	public Pratice5(int i) {
	}
	private B b;
	public static void main(String[] args) {
		Pratice5 p = new Pratice5();
		System.out.println(p.i);
	}
}
