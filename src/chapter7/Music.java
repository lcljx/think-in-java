package chapter7;

enum Note {
	MIDDLE_C, C_SHARP, B_FLAT;
}
class Instrument {
	public void play(Note n) {
		System.out.println("Instrument.play" + n);
	}
}
class Wind extends Instrument {
	public void play(Note n) {
		System.out.println("Wind.play " + n);
	}
}

public class Music {
	static void tune(Instrument i) {
		i.play(Note.MIDDLE_C);
	}
	public static void main(String[] args) {
		Wind w = new Wind();
		tune(w);
	}
}