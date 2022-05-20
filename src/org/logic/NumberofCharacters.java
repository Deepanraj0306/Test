package org.logic;

public class NumberofCharacters {
	public static void main(String[] args) {
		int count=0;
		String s="Java Program";
		String string = s.toLowerCase();
		
		for (int i = 0; i <string.length(); i++) {
			if(string.charAt(i)!=' ') {
				count++;
			}
			
		}
		System.out.println("Total Number of Characters in String:"+count);
	}

}
