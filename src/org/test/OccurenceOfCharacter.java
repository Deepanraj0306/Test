package org.test;

public class OccurenceOfCharacter {
	
	public static void main(String[] args) {
		
		String given="Agniprasath";
		
		char tofind='a';
		
		int occurence=0;
		
		given=given.toLowerCase();
		
		for(int i=0;i<given.length();i++) {
			
			if(given.charAt(i)==tofind) {
				
				occurence++;
			}
		}
		
		System.out.println("Occurence of a character:"+occurence+"times");
		
	}
}
