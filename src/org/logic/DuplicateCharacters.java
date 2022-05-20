package org.logic;

import java.util.Scanner;

public class DuplicateCharacters {
public static void main(String[] args) {
	
	Scanner scanner=new Scanner(System.in);
	
	System.out.println("Enter the word:");
	
	String givenString = scanner.next();
	
	//System.out.println(givenString);
	
	char[] charArray = givenString.toCharArray();
	
	for (int i = 0; i < givenString.length(); i++) {
		
		for (int j =i+1; j < givenString.length(); j++) {
			
		if (charArray[i]==charArray[j]) {
			
			System.out.print(charArray[j]+" ");

			break;
		}
		
		}
	}
}
}