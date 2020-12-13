package chapter9.mutiimplements;

interface InteF {
	String name = "林晨";
	void printF();
}

interface InteB extends InteF {
	String name = "Yoona";
	void printB();
}
interface InteC extends InteF {
	String name = "张焕妍";
	void printC();
}
public interface InteA extends InteB, InteC {
	void printA();
}

class TestInte implements InteA, InteB, InteC, InteF {

	@Override
	public void printF() {
		System.out.println(InteF.name);
	}

	@Override
	public void printC() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printB() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printA() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		TestInte t = new TestInte();
		t.printF();
	}
}
