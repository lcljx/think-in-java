package chapter5;

public class ArrayTest {
	public static void main(String[] args) {
//		int[] a = {1,2,3,4,6};
//		int[] b = a;
//		b[0] = 99;
//		for(int i : a) {
//			System.out.println(i);
//		}
//		StringArray s = new StringArray("666");
		StringArray[] arr = new StringArray[] {new StringArray("5"), new StringArray("55")};
	}
}

class StringArray {
	public StringArray(String s) {
		System.out.println(s);
	}
}