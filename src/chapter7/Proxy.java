package chapter7;
class Space {
	void move() {
		System.out.println("move");
	}
	void stop() {
		System.out.println("stop");	
	}
}
public class Proxy {
	private Space space = new Space();
	public void move() {
		space.move();
	}
	
	public static void main(String[] args) {
		Proxy p = new Proxy();
		p.move();
		p.space.stop();
	}
}
