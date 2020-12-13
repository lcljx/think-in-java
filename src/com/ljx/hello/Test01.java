package com.ljx.hello;

public class Test01 {

    public static void main(String[] args) {
        String A = new String("A");
        String B = new String("B");

        new Thread(() -> {
            synchronized (A) {
                System.out.println("AAA::");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (B) {
                    System.out.println("A---B");
                }
            }
        }).start();

        new Thread(() -> {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (B) {
                System.out.println("BBB::");
                synchronized (A) {
                    System.out.println("B---A");
                }
            }
        }).start();

    }

}