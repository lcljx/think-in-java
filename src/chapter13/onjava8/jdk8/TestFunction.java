package chapter13.onjava8.jdk8;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;
import java.util.function.ToIntFunction;

class IBaz {
    int i;

    IBaz(int i) {
        this.i = i;
    }
}

public class TestFunction {
    public static void main(String[] args) {
        Function<Map<String, Integer>, Integer> f = (s) -> {
            int p = s.get("first");
            return p;
        };
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("first", 8);
        Integer s = f.apply(map);
        System.out.println(s);

        ToIntFunction<IBaz> f5 = ib -> ib.i;
        int o = f5.applyAsInt(new IBaz(7));
        System.out.println(o);

        IntToLongFunction f8 = i -> i;
        System.out.println(f8.applyAsLong(6));

        IntToDoubleFunction f9 = i -> i;
        System.out.println(f9.applyAsDouble(5));
    }
}
