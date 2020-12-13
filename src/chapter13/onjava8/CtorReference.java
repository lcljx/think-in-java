package chapter13.onjava8;

class Dog {
    String name;
    int age = -1; // For "unknown"

    Dog() {
        name = "stray";
    }

    Dog(String nm) {
        name = nm;
    }

    Dog(String nm, int yrs) {
        name = nm;
        age = yrs;
    }

    void print() {
        System.out.println("666");
    }
}

interface MakeNoArgs {
    Dog make();
}

interface Make1Arg {
    Dog make(String nm);
}

interface Make2Args {
    Dog make(String nm, int age);
}

public class CtorReference {
    public static void main(String[] args) {
        MakeNoArgs noArgs = Dog::new;
        Make1Arg oneArg = Dog::new;
        Make2Args twoArg = Dog::new;
        Dog d1 = noArgs.make();
        System.out.println(d1.name + " " + d1.age);
        Dog d2 = oneArg.make("lxb");
        System.out.println(d2.name + " " + d2.age);
        Dog d3 = twoArg.make("lxb", 21);
        System.out.println(d3.name + " " + d3.age);
    }
}
