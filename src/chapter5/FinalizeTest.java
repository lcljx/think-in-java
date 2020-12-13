package chapter5;

public class FinalizeTest {

	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println("this is a finalize method");
	}
	
	public static void main(String[] args) {
		FinalizeTest f = new FinalizeTest();
		f = null;
		System.gc();
	}

}
