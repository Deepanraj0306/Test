package org.logic;

public class SwapTwoNumbers {
public static void main(String[] args) {
	int a=10;
	int b=20;
	
	a=a-b;
	b=a+b;
	a=b-a;
	
	System.out.println("After Swapping the Numbers:\n A is :"+a+"\n B is :"+b);
}
}
