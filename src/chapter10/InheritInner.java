package chapter10;
class WithInner {
    class Inner {
    	Inner() {
    		System.out.println("676");
    	}
    }
}
public class InheritInner extends WithInner.Inner {
    public InheritInner(WithInner wi) {
    	wi.super();
    }

	public static void main(String[] args) {
        WithInner wi = new WithInner();
        InheritInner ii = new InheritInner(wi);
    }
}
