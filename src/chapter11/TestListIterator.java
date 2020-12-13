package chapter11;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class TestListIterator {
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		int i = 0;
		while (i < 10) {
			list.add(String.valueOf(i));
			i++;
		}
		
//		ListIterator<String> listIterator = list.listIterator();
//		while (listIterator.hasNext()) {
//			System.out.println(listIterator.next());
//		}
		ListIterator<String> listIterator2 = list.listIterator(list.size());
		while (listIterator2.hasPrevious()) {
			System.out.println(listIterator2.previous());
		}
	}
}
