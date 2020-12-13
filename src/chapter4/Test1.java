package chapter4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Test1 {
	public static void main(String[] args) {
		vampireNums();
	}
	
	public static void printNums() {
		for (int i = 0; i < 100; i++) {
			System.out.println(i);
		}
	}
	
	public static void printChars() {
		for (char c = 0; c < 128; c++) {
			if (Character.isLowerCase(c))
				System.out.println(c);
		}
	}
	
	public static void randomNums() {
		int arr[] = new int[25];
		for (int i = 0; i < 25; i++) {
			int num = (int) (Math.random() * 100);
			arr[i] = num;
			if (i > 0) {
				compare(arr[i - 1], arr[i], i);
			}
		}
	}
	
	public static void compare(int a, int b, int i) {
		System.out.println("第" + i + "个数");
		if (a < b) {
			System.out.println("第" + i + "个数" + a + "比第" + (i+1) + "个数"+ b +"小");
		} else if (a > b) {
			System.out.println("第" + i + "个数" + a + "比第" + (i+1) + "个数"+ b +"大");
		} else {
			System.out.println("第" + i + "个数" + a + "等于" + (i+1) + "个数"+ b);
		}
	}
	
	public static void whileRandomNums() {
		int num[] =new int[2];
		int i=0;
		boolean flag=false;
		while(true){
			Random r=new Random();
			int n=r.nextInt();			
			if(flag){
				num[i]=n;
				compare(num[0],num[1], 5);
			}else{
				flag=true;
				num[i]=n;
			}
			i=i==0?1:0;
		}
	}
	
	public static void switchTest() {
		//测试STRING能不能起作用
		switch(5) {
			//case "hero": System.out.println("this is hero");
			case 5: System.out.println(5);
		}
	}
	
	public static void fibonacci(int i) {
		if (i < 0) {
			System.out.println("无效数字");
			return;
		}
		int a = 1, b = 1;
		StringBuilder sb = new StringBuilder();
		for (int j = 1; j <= i; j++) {
			if (j <= 2) {
				sb.append(1 + " ");
				continue;
			}
			int temp = a;
			a = b;
			b = temp + b;
			sb.append(b + " ");
		}
		System.out.println(sb.toString().trim());
	}
	
	public static void vampireNums() {
		long startTime = System.currentTimeMillis();
		int count = 0;
		for (int i = 11; i < 100; i++) {
			for (int j = i + 1;j < 100;j++) {
				 int target=i*j;
	                if (target<1000||target>9999){
	                    continue;
	                }
	                int[] targetNum = { target / 1000, target / 100 % 10, target / 10 % 100 % 10, target%10 };
	                int[] strNum = { i % 10, i / 10, j % 10, j / 10 };
	                Arrays.sort(targetNum);
	                Arrays.sort(strNum);
	                if (Arrays.equals(targetNum,strNum)){
	                    System.out.println(target + " = " + i + " * " + j);
	                }

				count++;
			}
		}
		long eTime = System.currentTimeMillis();
		System.out.println("共循环" + count +"次");
		System.out.println("时间" + (eTime - startTime) + "ms");
	}
}
