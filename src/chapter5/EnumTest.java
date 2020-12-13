package chapter5;

public class EnumTest {
	static Spiciness rmb;
	public EnumTest(Spiciness rmb) {
		this.rmb = rmb;
	}
	
	public static void main(String[] args) {
		EnumTest t = new EnumTest(Spiciness.TEN);
		switch(rmb) {
			case TEN : System.out.println("10");
		}
	}
}


enum Spiciness {
	ONE(1), TWO( 2), FIVE(5), TEN(10);
	private String name;  
    private int value; 
	Spiciness (int value) {
		this.value = value;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}	
}