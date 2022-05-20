package org.test;

import java.util.Scanner;

public class FindMyPosition {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the Character:");
		
		char givenchar = scanner.next().charAt(0);
		
		int asciivalue=(int)givenchar;
		
		System.out.println("Ascii value of given Character:"+asciivalue);
		
		int position=asciivalue-96;
		
		System.out.println("Ascii value of given Character:"+position);
	}
}
