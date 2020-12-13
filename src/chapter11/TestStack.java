package chapter11;

import java.util.ArrayDeque;
import java.util.Deque;

public class TestStack {
	public static void main(String[] args) {
		Deque<String> stack = new ArrayDeque<>();
		for (String s : "My dog has fleas".split(" "))
			stack.push(s);
		while (!stack.isEmpty())
			System.out.print(stack.pop() + " ");
	}
}