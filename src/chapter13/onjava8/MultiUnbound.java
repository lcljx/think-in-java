package chapter13.onjava8;

class This {
    void two(int i, double d) {
        System.out.println(i + " " + d);
    }

    void three(int i, double d, String s) {
        System.out.println(i + " " + d + " " + s);
    }

    void four(int i, double d, String s, char c) {
        System.out.println(i + " " + d + " " + s + " " + c);
    }
}

interface TwoArgs {
    void call2(This athis, int i, double d);
}

interface ThreeArgs {
    void call3(This athis, int i, double d, String s);
}

interface FourArgs {
    void call4(This athis, int i, double d, String s, char c);
}

public class MultiUnbound {
    public static void main(String[] args) {
        This athis = new This();
        //TwoArgs 的call2方法有两个
        TwoArgs t = This::two;
        t.call2(athis, 1, 2);
        ThreeArgs t3 = This::three;
        t3.call3(athis, 1, 2, "3");
        FourArgs fourargs = This::four;
        fourargs.call4(athis, 1, 2, "str", 'c');
    }
}
