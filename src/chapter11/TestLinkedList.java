package chapter11;

import java.util.LinkedList;

public class TestLinkedList {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		int i = 0;
		while (i < 10) {
			list.add(String.valueOf(i));
			i++;
		}
		
		//output
		System.out.println(list);
		
		//----------都是打印第一个元素
		//getFirst
		System.out.println(list.getFirst());
		
		//element()
		System.out.println(list.element());
		
		// Only differs in empty-list behavior:
	    System.out.println("list.peek(): " + list.peek());
	    
	    //----------都是移除第一个元素
	    //remove()
	    System.out.println(list.remove());
	    System.out.println(list);
	    //removeFirst()
	    System.out.println(
	    	      "pets.removeFirst(): " + list.removeFirst());
	    System.out.println(list);
	    
	    // Only differs in empty-list behavior:poll()
	    System.out.println("pets.poll(): " + list.poll());
	    System.out.println(list);
	    
	    //添加元素
	    list.addFirst("n2");
	    System.out.println(list);
	    
	    //添加到末尾
	    list.offer("n1");
	    System.out.println(list);
	    list.addLast("n0");
	    System.out.println(list);
	    
	    //移除末尾元素
	    list.removeLast();
	    System.out.println(list);
	}
}
