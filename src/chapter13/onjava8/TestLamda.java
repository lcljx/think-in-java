package chapter13.onjava8;

interface MyInterface {
	void lMethod(String str);
}

public class TestLamda {
	public static void test(MyInterface myInterface){
        myInterface.lMethod("Hello World!");//设置参数内容
    }

    public static void main(String[] args) {
    	MyInterface m = (s)-> {
             s=s+s;
             System.out.println(s);
         };
         m.lMethod("[pp");
    }
}
