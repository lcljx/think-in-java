package chapter5;

public class Tank {
	boolean isFull = false;
	
	@Override
	protected void finalize() throws Throwable {
		if (this.isFull) {
			super.finalize();
			System.out.println("This tank is full");
		} else {
			System.out.println("This tank is not full");
		}
	}
	
	public Tank(boolean isFull) {
		this.isFull = isFull;
	}
	public static void main(String[] args) {
		Tank tank = new Tank(true);
		tank = null;
		System.gc();
	}
}
