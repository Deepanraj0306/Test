package org.logic;

import java.util.Scanner;

public class Fibonacci {

public static void main(String[] args) {
	
	Scanner s=new Scanner(System.in);
	
	System.out.println("Enter the Number:");
	
	int total = s.nextInt();
	
	System.out.println("Enter the first Number:");
	int first = s.nextInt();
	
	System.out.println("Enter the Second Number:");
	
	int second = s.nextInt();
	
	for (int i = 2; i <=total; i++) {
		
		int store=first+second;
		System.out.println(store);
		first=second;
		second=store;
		
	}
}
}
