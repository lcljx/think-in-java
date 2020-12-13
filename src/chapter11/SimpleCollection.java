package chapter11;

import java.util.HashSet;
import java.util.Set;
//List是有序的
public class SimpleCollection {
	public static void main(String[] args) {
		Set<Integer> c = new HashSet<>();
		for (int i = 0; i < 10; i++)
			c.add(i); // Autoboxing
		for (Integer i : c)
			System.out.print(i + ", ");
	}
}
