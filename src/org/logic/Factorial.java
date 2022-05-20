package org.logic;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		
		int factorial=1;
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the Number:");
		
		int number = scanner.nextInt();
		
	for (int i =1; i <=number; i++) {
		factorial=factorial*i;
	}
	System.out.println(factorial);
	}
}
