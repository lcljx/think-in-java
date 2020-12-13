package chapter11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ContainsTest {
	
	public static void main(String[] args) {
		final List<String> list = new ArrayList<>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		
		final String[] s = {"5","6","7","8"};
		final String[] s2 = {"9","10","11","12"};
		Collections.addAll(list, s);   
		Collections.addAll(list, s);  
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
