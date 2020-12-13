package chapter7;

class Game {
	public Game(int i) {
		System.out.println("Game Constructor");
	}
}
class BoardGame extends Game {
	public BoardGame(int i) {
		super(i);
		System.out.println("BoardGame Constructor");
	}
}
public class Chess extends BoardGame {
	public Chess() {
		super(11);
		System.out.println("Chess Constructor");
	}
	
	public static void main(String[] args) {
		Chess x = new Chess();
	}
}
