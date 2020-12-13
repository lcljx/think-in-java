package chapter11;

import java.util.ArrayList;
import java.util.LinkedList;

public class TestList {
    static int size = 10000000;

    static void arraylist(ArrayList a) {

        // 截取当前时间/毫秒
        long l = System.currentTimeMillis();

        for (int i = 0; i < size; i++) {
            a.add(i);

        }
        long c = System.currentTimeMillis();

        System.out.println("ArrayList插入元素所需时间：" + (c - l) + "ms");

        long g = System.currentTimeMillis();

        for (int i = 0; i < size; i++) {
            a.get(i);
        }
        long g1 = System.currentTimeMillis();
        System.out.println("ArrayList查找元素所需时间：" + (g1 - g) + "ms");

        long l2 = System.currentTimeMillis();

        for (int i = size - 1; i > -1; i--) {
            a.remove(i);
        }

        long c2 = System.currentTimeMillis();

        System.out.println("ArrayList删除元素所需时间：" + (c2 - l2) + "ms");
    }

    static void linklist(LinkedList b) {
        long l = System.currentTimeMillis();

        for (int i = 0; i < size; i++) {
            b.add(i);
        }

        long c = System.currentTimeMillis();

        System.out.println("LinkedList插入元素所需时间：" + (c - l) + "ms");

        // long g=System.currentTimeMillis();
        // for (int i=0;i<size;i++){
        // b.get(i);
        // }
        //
        // long g1=System.currentTimeMillis();
        // System.out.println("LinkedList插入查找元素所需时间："+(g1-g)+"ms");

        long l1 = System.currentTimeMillis();

        for (int i = size - 1; i > -1; i--) {
            b.remove(i);
        }
        long c1 = System.currentTimeMillis();

        System.out.println("LinkedList删除元素所需时间：" + (c1 - l1) + "ms");
    }

    public static void main(String[] args) {

        ArrayList a = new ArrayList();
        LinkedList b = new LinkedList();
        arraylist(a);
        linklist(b);
    }

}
