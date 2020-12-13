package chapter5;

class Bowl {
	public Bowl(int marker) {
		System.out.println("Bowl(" + marker + ")");
	}
	
	void f1(int marker) {
		System.out.println("f1("+ marker + ")");
	}
}

class Table {
	static Bowl bowl1 = new Bowl(1);
	public Table() {
		System.out.println("table");
		bowl1.f1(1);
	}
	
	void f2(int marker) {
		System.out.println("f2("+ marker + ")");
	}
}
class Cupboard {
	Bowl bowl3 = new Bowl(3);
	static Bowl bowl4 = new Bowl(4);
	public Cupboard() {
		System.out.println("curboard");
		bowl4.f1(2);
	}
	void f3(int marker) {
		System.out.println("f3("+ marker + ")");
	}
	static Bowl bowl5 = new Bowl(5);
}
public class InitialData {
	
	public static void main(String[] args) {
		System.out.println("print a new cupboard");
		new Cupboard();
		System.out.println("print a new cupboard");
		new Cupboard();
		table.f2(1);
		cupboard.f3(1);
	}
	
	static Table table = new Table();
	static Cupboard cupboard = new Cupboard();
}

