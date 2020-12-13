package chapter10;
class Wrapping {
	private int i;
	Wrapping(int x) {
		i = x;
	}
	public int value() {
		return i;
	}
}
public class Parcel8 {
	public Wrapping wrapping(int x) {
		return new Wrapping(x) {
			public int value() {
				return super.value() * 7;
			}
		};
	}
	
	public static void main(String[] args) {
		Parcel8 p = new Parcel8();
		int v = p.wrapping(6).value();
		System.out.println(v);
	}
}
