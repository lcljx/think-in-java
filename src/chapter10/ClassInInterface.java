package chapter10;

public interface ClassInInterface {
	void howdy();
	class Test implements ClassInInterface {

		@Override
		public void howdy() {
			print();
		}

		public static void print() {
			System.out.println("Howdy!");
			
		}
		
	}
}

class ClassInInterfaceImpl implements ClassInInterface {

	@Override
	public void howdy() {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		Test t = new Test();
		t.print();
	}
	
}

class TestBed {
	public void f() {
		System.out.println("f()");
	}
	public static void main(String[] args) {
		TestBed t = new TestBed();
		t.f();
	}
}