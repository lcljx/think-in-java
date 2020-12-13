package chapter9.eight;

class A {
	interface B {void f();}
	public class Bimp implements B {
		public void f() {}
	}
	private class Bimp2 implements B {
		public void f() {}
	}
	
	interface C {void f();}
	
	class Cimp implements C {
		public void f() {}
	}
	private class Cimp2 implements C {
		public void f() {}
	}
	
	private interface D {void f();}
	
	private class Dimp implements D {
		public void f() {}
	}
	public class Dimp2 implements D {
		public void f() {}
	}
	
	public D getD() {return new Dimp2();}
	private D dRef;
	public void received(D d) {
		this.dRef = d;
		dRef.f();
	}
}
interface E {
	interface G {void f();}
	public interface H {void f();}
	
	void g();
	//The interface member type I can only be public
//	private interface I {};
}
public class Nestinginterfaces {
	public class Bimp implements  A.B {

		@Override
		public void f() {
			// TODO Auto-generated method stub
			
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
