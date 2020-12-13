package chapter13.onjava8;

class X {
	String f() {
		return "X::F()";
	}
}

interface MakeString {
	String make();
}

interface TransformX {
	String transform(X x);
}

public class UnboundMethodReference {
	public static void main(String[] args) {
		X x = new X();
		TransformX sp = X::f;
		System.out.println(sp.transform(x));
		System.out.println(x.f());

		// MakeString mkStr = X::f;
		MakeString mk = x::f;
		System.out.println(mk.make());
	}
}
