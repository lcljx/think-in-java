package chapter13.onjava8;

import java.util.function.Function;

class One {
    One() {
        System.out.println("one");
    }
}

class Two {
    Two() {
        System.out.println("two");
    }
}

public class ConsumeFunction {
    static Two consume(Function<One, Two> onetwo) {
        return onetwo.apply(new One());
    }

    public static void main(String[] args) {
        Two two = consume(one -> new Two());
    }
}