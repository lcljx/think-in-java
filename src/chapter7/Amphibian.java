package chapter7;

public class Amphibian {
	void print() {
		System.out.println("This is amphibian");
	}
	
	void print2() {
		System.out.println("This is amphibian");
	}
}


class Frog extends Amphibian {
	
	void print() {
		System.out.println("This is Frog");
	}
	
	public static void main(String[] args) {
		final Amphibian f = new Frog();
		f.print();
	}
}