package chapter10;

public class Parcel11 {
	private static class PracelContents implements Contents {
		private int i = 11;
		public int value() {
			return i;
		}
	}
	protected static class ParcelDestination implements Destination {
		private String label;
		private ParcelDestination(String whereTo) {
			label = whereTo;
		}
		@Override
		public String readLabel() {
			return label;
		}
	}
	public static void f() {
	}
	static int x = 10;
	static class AnotherLevel {
		public static void f() {}
		static int x = 10;
	}
	
	public static Destination destination(String s) {
		return new ParcelDestination(s);
	}
	
	public static Contents contents() {
		return new PracelContents();
	}
	
	public static void main(String[] args) {
		Contents c = contents();
		Destination d = destination("Tasmania");
	}
}
