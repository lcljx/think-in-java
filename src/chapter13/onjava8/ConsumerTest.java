package chapter13.onjava8;

import java.util.function.Consumer;

public class ConsumerTest {
    public static void main(String[] args) {
        Consumer f = System.out::println;
        Consumer f2 = n -> System.out.println(n + "-F2");
        f.andThen(f2).accept("test2");
    }
}
