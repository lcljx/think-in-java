package chapter10.homework;

public class Test18 {
	private static class PrintTest {
		void print() {
			System.out.println("Yoona");
		}
	}
	private static void prints(String s) {
		System.out.println(s);
	}
	public static void main(String[] args) {
		PrintTest p = new PrintTest();
		p.print();
		prints("Jessica");
	}
}
