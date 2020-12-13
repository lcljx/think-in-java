package chapter8;


public class Rodent {
	void bite() {
		System.out.println("Rodent bite");
	}
	
	void run() {
		System.out.println("Rodent run");
	}
}

class Mouse extends Rodent {
	public Mouse() {
	}
	@Override
	void bite() {
		System.out.println("Mouse bite");
	}
}

class Gerbil extends Rodent {
	public Gerbil() {
	}
	@Override
	void run() {
		System.out.println("Gerbil run");
	}
}

class Main {
	public static void main(String[] args) {
		Rodent[] rodents = new Rodent[2];
		rodents[0] = new Mouse();
		rodents[1] = new Gerbil();
		
		rodents[0].bite();
		rodents[0].run();
		
		rodents[1].bite();
		rodents[1].run();
	}
}