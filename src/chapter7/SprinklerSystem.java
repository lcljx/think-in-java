package chapter7;

class WaterSource {
	private String s;
	WaterSource() {
		System.out.println("WaterSouce()");
		s = "Constructed";
	}
	public String toString() {
		return s;
	}
}

public class SprinklerSystem {
	private String val1, val2, val3, val4;
	private WaterSource waterSource = new WaterSource();
	private int i;
	private float f;
	public String toString() {
		return "val1=" + val1 + " "
				+ "val2=" + val2 + " "
				+ "val3=" + val3 + " "
				+ "val4=" + val4 + "\n"
				+ "i = " + i +" " + "f=" + f +" "
				+"source=" + waterSource;
	}
	public static void main(String[] args) {
		SprinklerSystem sprinklers = new SprinklerSystem();
		System.out.println(sprinklers);
	}

}
