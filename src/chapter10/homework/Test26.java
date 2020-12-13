package chapter10.homework;
class MTest26 {
	class InnerTest26 {
		InnerTest26() {
			System.out.println("InnerTest26");
			print();
		}
	}
	void print() {
		System.out.println("print");
	}
}
public class Test26 extends MTest26.InnerTest26 {
	Test26(MTest26 m) {
		m.super();
	}
	public static void main(String[] args) {
		MTest26 m = new MTest26();
		Test26 t = new Test26(m);
	}
}
