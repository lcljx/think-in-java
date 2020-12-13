package chapter8;
class Shared {
	private int refcount = 0;
	private static long counter = 0;
	private final long id = counter++;
	
	Shared() {
		System.out.println("Creating " + this);
	}
	public void addRef() {
		refcount++;
	}
	protected void dispose() {
		if (--refcount == 0) {
			System.out.println("Disposing " + this);
		}
	}
	public String toString() {
		return "shared " + id;
	}
	@Override
	protected void finalize() {
		System.out.println("Clenaing" + id);
		if (refcount == 0) {
			System.out.println("Clear success");
		}
	}
}

class Composing {
	private Shared shared;
	private static long counter = 0;
	private final long id = counter++;
	
	Composing(Shared shared) {
		System.out.println("Creating " + this);
		this.shared = shared;
		this.shared.addRef();
	}
	
	protected void dispose() {
		System.out.println("Disposing " + this);
		shared.dispose();
	}
	
	public String toString() {
		return "Composing " + id;
	}
}
public class ReferenceCounting {
	public static void main(String[] args) {
		Shared shared = new Shared();
		Composing[] composings = {
				new Composing(shared),
				new Composing(shared),
				new Composing(shared),
				new Composing(shared),
				new Composing(shared)
		};
		for (Composing c : composings) {
			c.dispose();
		}
		new Composing(new Shared());
        System.gc();
	}
}
