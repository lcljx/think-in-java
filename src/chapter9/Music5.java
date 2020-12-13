package chapter9;

abstract class Test5 {
	void print() {
		System.out.println("666s");
	}
	Test5(){
		this.print();
	}
}

public class Music5 extends Test5 {
	void print() {
		System.out.println("555");
	}
	public static void main(String[] args) {
		Music5 m = new Music5();
		m.print();
	}
}
