package chapter9;

abstract class AbstractTest {
	AbstractTest() {
		print();
	}
	abstract void print();
}

public class NoAbstractMethod extends AbstractTest {
	int i = 10;
	void print() {
		System.out.println(i);
	}
	public static void main(String[] args) {
//		final AbstractTest t = new AbstractTest();
//		t.print();
		NoAbstractMethod n = new NoAbstractMethod();
		n.print();
	}
}
