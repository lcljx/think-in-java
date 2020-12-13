package chapter10;

public class Outer {
	private String str;
	public Outer(String str) {
		this.str = str;
	}
	class Inner {
		public void print(Object s) {
			System.out.println(s);
		}
		
		@Override
		public String toString() {
			return str.toString();
		}
	}

	public Inner inener() {
		return new Inner();
	}

	public static void main(String[] args) {
		Outer outer = new Outer("666");
		Outer.Inner inner = outer.inener();
		inner.print("张焕妍");
		System.out.println(inner.toString());
	}
}
