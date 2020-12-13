package chapter8;

public class Cycle {
	void ride(String str) {
		System.out.println("使用的交通工具是Cycle: " + str);
	}
}

class Unicycle extends Cycle {
	void balance() {
		System.out.println("Unicycle balance");
	}
}

class Bicycle extends Cycle {
	void ride(String str) {
		System.out.println("使用的交通工具是Bicycle: " + str);
	}
	void ring(String str) {
		System.out.println("使用的交通工具是Bicycle: " + str);
	}
}

class Tricycle extends Cycle {
	void ride(String str) {
		System.out.println("使用的交通工具是Tricycle: " + str);
	}
}

class Ride {
	public static void main(String[] args) {
		Unicycle u = new Unicycle();
		u.balance();
		Cycle u2 = new Unicycle();
		((Unicycle) u2).balance();
		Cycle u3 = new Cycle();
		((Unicycle) u3).balance();
	}
}