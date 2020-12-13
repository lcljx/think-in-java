package chapter8;

class Fruits {
	String printFruitsName() {
		return "fruits";
	}
	@Override
	public String toString() {
		return printFruitsName();
	}
}
public class Test6 extends Fruits {
	@Override
	String printFruitsName() {
		return "Test6";
	}
	
	public static void main(String[] args) {
		Test6 t = new Test6();
		System.out.println(t.toString());
	}
}
