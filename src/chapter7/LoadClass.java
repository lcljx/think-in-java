package chapter7;

class Insect {
	private int i = 9;
	protected int j;
	private int k2 = printInit("LoadClass.k2 initialzed");
	public Insect() {
		System.out.println("i = " + i + ",j=" + j);
	}
	private static int x1 = printInit("static Insect.x1 initialzed");
	
	static int printInit(String s) {
		System.out.println(s);
		return 47;
	}
}
public class LoadClass extends Insect {
	
	private int k = printInit("LoadClass.k initialzed");
	
	public LoadClass() {
		System.out.println("k=" + k);
		System.out.println("j=" + j);
	}
	
	private static int x2 = printInit("static LoadClass.x2 initialzed");
	
	public static void main(String[] args) {
		System.out.println("LoadClass");
		LoadClass l = new LoadClass();
		System.out.println("LoadClass2----");
		LoadClass l2 = new LoadClass();
	}
}
