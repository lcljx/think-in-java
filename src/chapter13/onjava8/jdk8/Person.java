package chapter13.onjava8.jdk8;

@FunctionalInterface
public interface Person {

    String state2 = "已審核";
    public static final String state = "已審核";

    public static void play() {
        System.out.println("play");
    }

    default void play2() {
        System.out.println("play2");
    }

    void say();
}

class Test {
    public static void main(String[] args) {
        Person p = new Person() {
            @Override
            public void say() {
                System.out.println("person");
            }
        };
        p.say();

        Person p2 = () -> System.out.println("person2");
        p2.say();
    }

}