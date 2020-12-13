package chapter7;

class WithFinals {
	private final void f() {
		System.out.println("WithFinals.f()");
	}
	
	public void g() {
		System.out.println("WithFinals.g");
	}
}

class OverridingPrivate extends WithFinals {
	private final void f() {
		System.out.println("OverridingPrivate.f()");
	}
	
	public void g() {
		System.out.println("OverridingPrivate.g");
	}
}

class OverridingPrivate2 extends OverridingPrivate {
	public final void f() {
		System.out.println("OverridingPrivate2.f()");
	}
	
	@Override
	public void g() {
		System.out.println("OverridingPrivate2.g()");
	}
}
public class FinalOverridingIllusion {

	public static void main(String[] args) {
		OverridingPrivate2 o2 = new OverridingPrivate2();
		o2.f();
		o2.g();
		
	}

}
