package org.test;

public class LengthOfString {
	
	public static void main(String[] args) {
		
		String givenstring="java";
		int length=0;
		
		char[] charArray = givenstring.toCharArray();
		
		for (char c : charArray) {
			
			length++;
		}
		
		System.out.println(length);
	}

}
