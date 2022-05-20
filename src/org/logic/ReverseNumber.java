package org.logic;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the Number:");
		
		int givenNumber = scanner.nextInt();
		
		int reverseNumber=0;
		
		while(givenNumber>0) {
			
			int temp=givenNumber%10;
			reverseNumber=reverseNumber*10+temp;
			givenNumber=givenNumber/10;
			
		}
		System.out.println(reverseNumber);
	}

}
