package chapter5;

public class ConstructTest2 {

	public ConstructTest2(int a, String b) {
		super();
		System.out.println("this is a construct method!");
	}
	public ConstructTest2(int a) {
		super();
		System.out.println("this is a construct method int!");
	}
	public ConstructTest2(String b, int a) {
		this(6, "6");
		System.out.println("this is a construct method!" + b);
	}

	public static void main(String[] args) {
		ConstructTest2 c = new ConstructTest2(1, "2");
		ConstructTest2 c1 = new ConstructTest2("2", 1);
	}
}
