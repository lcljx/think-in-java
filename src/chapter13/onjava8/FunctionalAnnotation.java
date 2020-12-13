package chapter13.onjava8;

@FunctionalInterface
interface Functional {
    String goodbye(String arg);
}

interface FunctionalNoAnn {
    String goodbye(String arg);
}

public class FunctionalAnnotation {
    public String goodbye(String arg) {
        return "Goodbye, " + arg;
    }

    public static void main(String[] args) {
        FunctionalAnnotation fa = new FunctionalAnnotation();
        Functional f = fa::goodbye;
        System.out.println(f.goodbye("byebye"));
        FunctionalNoAnn fna = fa::goodbye;
        fna.goodbye("byebye");
        // Functional fac = fa; // Incompatible
        Functional fl = a -> "Goodbye, " + a;
        fl.goodbye("arg");
        FunctionalNoAnn fnal = a -> "Goodbye, " + a;
        fnal.goodbye("arg");
    }
}