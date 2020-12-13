package com.ljx.hello;


public class ShowProperties {
	static int i;
	static char j;
	public static void main(String[] args) {
//		System.getProperties().list(System.out);
//		System.out.println(System.getProperty("user.name"));
//		System.out.println(System.getProperty("java.library.path"));
//		System.out.println(i);
//		System.out.println(j);
//		
//		byte a = 126;
//		System.out.println(a);
		final long l = 0x1f;
		println(l);
		System.out.println(Long.toBinaryString(l));
	}
	
	public static void println(Object o) {
		System.out.println(o);
	}
}
