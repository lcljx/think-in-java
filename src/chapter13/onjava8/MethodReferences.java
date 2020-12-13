package chapter13.onjava8;

interface Callable { // [1]
	void call(String s);
}

class Describe {
	String show(String msg) { // [2]
		System.out.println(msg);
		return "";
	}
}

public class MethodReferences {
	static void hello(String name) {
		System.out.println("Hello, " + name);
	}

	static class Description {
		String about;

		Description(String desc) {
			about = desc;
		}

		void help(String msg) {
			System.out.println(about + " " + msg);
		}
	}

	static class Helper {
		static void assist(String msg) {
			System.out.println(msg);
		}
	}

	public static void main(String[] args) {
		Describe d = new Describe();
		Callable c = d::show;
		c.call("call()");

		c = MethodReferences::hello;
		c.call("Bob");

		c = new Description("valuable")::help;
		c.call("information");

		c = Helper::assist;
		c.call("Help");
	}

}
