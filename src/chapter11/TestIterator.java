package chapter11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class TestIterator {
	public static void display(Iterable<String> ip) {
		Iterator<String> it = ip.iterator();
		while (it.hasNext()) {
			String p = it.next();
			System.out.print(p + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		int i = 0;
		while (i < 10) {
			list.add(String.valueOf(i));
			i++;
		}
		Set<String> set = new HashSet<String>();
		int j = 0;
		while (j < 10) {
			set.add(String.valueOf(j));
			j++;
		}

		display(list);
	}
}
