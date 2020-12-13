package chapter13.onjava8.jdk8;

import java.util.function.Consumer;
import java.util.function.Function;

public class Tom {
    public static void toSay(Consumer<String> consumer, String msg) {
        consumer.accept(msg);
    }

    public static void toPlay(Function<String, Integer> function, String msg) {
        System.out.println(function.apply(msg));
    }

    public static void main(String[] args) {
        Tom.toSay((msg) -> System.out.println(msg + "：ppt"), "ip");

        Tom.toPlay((msg) -> Integer.valueOf(msg), "5");
    }
}