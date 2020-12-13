package chapter10.homework;

interface ITest9 {
	void print();
}

public class Test9 {
	public ITest9 test() {
		class SubTest9 implements ITest9 {

			@Override
			public void print() {
				System.out.println("张焕妍");
			}
		}
		ITest9 s = new SubTest9();
		return s;
	}
	
	public ITest9 test2(boolean a) {
		if (a) {
			class SubTest9 implements ITest9 {
				
				@Override
				public void print() {
					System.out.println("唐嫣");
				}
			}
			ITest9 s = new SubTest9();
			return s;
		}
		return null;
	}
	public static void main(String[] args) {
		Test9 t9 = new Test9();
		t9.test().print();
		t9.test2(true).print();
	}
} 
