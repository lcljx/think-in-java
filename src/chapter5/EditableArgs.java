package chapter5;

public class EditableArgs {

	static void f(int a, String... str) {
		System.out.println(a);
		for (String s : str) {
			System.out.println(s);
		}
	}
	
	static void fb(float i, Character...characters) {
		System.out.println("first");
	}
	static void fb(int i, Character...characters) {
		System.out.println("second");
	}
	public static void main(String[] args) {
		 fb(1, 'a');
		 fb('a', 'b');
	}
}
