package chapter10;

public class Parcel2 {
	private String str = "张焕妍";
	class Contents {
		private int i = 11;

		public int value() {
			return i;
		}
		
		public void print() {
			System.out.println(str);
		}
	}

	class Destination {
		private String label;

		Destination(String whereTo) {
			label = whereTo;
		}

		String readLabel() {
			return label;
		}
	}

	public Destination to(String s) {
		return new Destination(s);
	}

	public Contents contents() {
		return new Contents();
	}
	
	public void ship(String dest) {
		Contents c = contents();
		c.print();
		Destination d = new Destination(dest);
		System.out.println(d.readLabel());
	}
	
	public static void main(String[] args) {
		Parcel2 p = new Parcel2();
		p.ship("Tasmania");
		
		//Defining references to inner classes;
		Parcel2.Contents c = p.contents();
		Parcel2.Destination d = p.to("Tasmania");
	}

}
