package com.ljx.hello;

enum Note{
    MIDDLE_C,C_SHARP,B_FLAT;
}
class Instrument {
    void play(Note n) { System.out.println("Instrument.play() " + n); }
    public String what() {
        return "Instrument";
    }
    public String toString(){
        return what();
    }
    void adjust() { System.out.println("Adjusting Instrument"); }
}
 
class Wind extends Instrument {
    void play(Note n) { System.out.println("Wind.play() " + n); }
    public String what() {
        return "Wind";
    }
    public String toString(){
        return what();
    }
    void adjust() { System.out.println("Adjusting Wind"); }
}
 
class Percussion extends Instrument {
    void play(Note n) { System.out.println("Percussion.play() " + n); }
    public String what() {
        return "Percussion";
    }
    public String toString(){
        return what();
    }
    void adjust() { System.out.println("Adjusting Percussion"); }
}
 
class Stringed extends Instrument {
    void play(Note n) { System.out.println("Stringed.play() " + n); }
    public String what() {
        return "Stringed";
    }
 
    void adjust() { System.out.println("Adjusting Stringed"); }
}
 
class Brass extends Wind {
    void play(Note n) { System.out.println("Brass.play() " + n); }
    void adjust() { System.out.println("Adjusting Brass"); }
}
 
class Woodwind extends Wind {
    void play(Note n) {System.out.println("Woodwind.play() " + n); }
 
    public String what() {
        return "Woodwind";
    }
    public String toString(){
        return what();
    }
}
 
public class Main {
    // Doesn't care about type, so new types
    // added to the system still work right:
    public static void tune(Instrument i) {
        // ...
        i.play(Note.MIDDLE_C);
    }
    public static void tuneAll(Instrument[] e) {
        for(Instrument i : e) {
            tune(i);
            System.out.println(i);
        }
 
    }
    public static void main(String[] args) {
        // Upcasting during addition to the array:
        Instrument[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind()
        };
        tuneAll(orchestra);
    }
}