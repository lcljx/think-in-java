package chapter13.onjava8;

interface Description {
	String brief();
}

interface Body {
	String detailed(String head);
}

interface Multi {
	String twoArg(String head, Double d);
}

public class LambdaExpressions {
	static Body bod = h -> h + "No parens!";
	static Body bod2 = (h) -> h + " More details";
	static Description desc = () -> "Short info";
	static Multi mult = (h, n) -> h + n;
	static Description moreLines = () -> { // [5]
		System.out.println("moreLines()");
		return "from moreLines()";
	};

	public static void main(String[] args) {
		System.out.println(bod.detailed("Oh!"));
		System.out.println(bod2.detailed("Hi!"));
		System.out.println(desc.brief());
		System.out.println(mult.twoArg("Pi!", 3.141592653));
		System.out.println(moreLines.brief());
	}
}
