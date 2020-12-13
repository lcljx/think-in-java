package chapter8;

class Characteristic {
	private String s;
	public Characteristic(String s) {
		this.s = s;
		System.out.println("Creating Characteristic " + s);
	}
	protected void dispose() {
		System.out.println("disposing Characteristic " + s);
	}
}

class Decription {
	private String s;
	public Decription(String s) {
		this.s = s;
		System.out.println("Creating Decription " + s);
	}
	protected void dispose() {
		System.out.println("disposing Decription " + s);
	}
}

class LivingCreature {
	private Characteristic p = new Characteristic("is alive");
	private Decription t = new Decription("Basic living creature");
	
	LivingCreature() {
		System.out.println("LivingCreature()");
	}
	
	protected void dispose() {
		System.out.println("LivingCreature dispose");
		t.dispose();
		p.dispose();
	}
}

class Animal extends LivingCreature {
	private Characteristic p = new Characteristic("has heart");
	private Decription t = new Decription("Animal not vegetable");
	
	Animal() {
		System.out.println("Animal()");
	}
	protected void dispose() {
		System.out.println("Animal dispose");
		t.dispose();
		p.dispose();
		super.dispose();
	}
}

class Amphibian extends Animal {
	private Characteristic p = new Characteristic("can live in water");
	private Decription t = new Decription("Both water and land");
	
	Amphibian() {
		System.out.println("Amphibian()");
	}
	
	protected void dispose() {
		System.out.println("Amphibian dispose");
		t.dispose();
		p.dispose();
		super.dispose();
	}
}
public class Frog extends Amphibian {
	private Characteristic p = new Characteristic("Croaks");
	private Decription t = new Decription("Eats bugs");
	
	Frog() {
		System.out.println("Frog()");
	}
	
	protected void dispose() {
		System.out.println("Frog dispose");
		t.dispose();
		p.dispose();
		super.dispose();
	}
	
	public static void main(String[] args) {
		Frog frog = new Frog();
		System.out.println("Bye!");
		frog.dispose();
	}
}
