package chapter8;

enum Note {
	MIDDLE_C, C_SHARP, B_FLAT;
}
class Instrument {
	public void play(Note n) {
		System.out.println("Instrument.play" + n);
	}
}

class Stringed extends Instrument {
	public void play(Note n) {
		System.out.println("Stringed.play" + n);
	}
}

class Brass extends Instrument {
	public void play(Note n) {
		System.out.println("Brass.play" + n);
	}
}

public class Music2 {
	static void tune(Instrument i) {
		i.play(Note.MIDDLE_C);
	}
	public static void main(String[] args) {
		Brass w = new Brass();
		tune(w);
	}
}
