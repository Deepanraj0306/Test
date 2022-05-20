package org.logic;

import java.util.Scanner;

public class LowerToUpperCase {
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the Word:");
		
		String givenString = scanner.next();
		
		
		givenString=givenString.toUpperCase();
		
		System.out.println("lowercase to UpperCase:"+givenString);
	}

}
