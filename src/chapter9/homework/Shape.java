package chapter9.homework;
interface Cycle {
	void cycleType(String c);
}
interface CycleFactory {
	Cycle getCycle();
}

class Unicycle implements Cycle{
	@Override
	public void cycleType(String c) {
		System.out.println(c);
	}
}
class UnicycleFactory implements CycleFactory {
	@Override
	public Cycle getCycle() {
		// TODO Auto-generated method stub
		return new Unicycle();
	}
}
class Bicycle implements Cycle{
	@Override
	public void cycleType(String c) {
		System.out.println(c);
	}
}
class BicycleFactory implements CycleFactory {
	@Override
	public Cycle getCycle() {
		// TODO Auto-generated method stub
		return new Unicycle();
	}
}
public class Shape {
	public static void showCycleType(CycleFactory factory) {
		Cycle c = factory.getCycle();
		c.cycleType(factory.toString());
	}
	
	public static void main(String[] args) {
		showCycleType(new UnicycleFactory());
		showCycleType(new BicycleFactory());
	}
}
