package org.logic;

public class TotalVowelsandConsonants {

	public static void main(String[] args) {
		
		int vowels=0,consonants=0;
		
		String string="logicalProgram";
		for (int i = 0; i < string.length(); i++) {
			char ch = string.charAt(i);
			if(ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				vowels++;
			}
			else if(ch>='a' && ch<='z') {
				
				consonants++;
			}
		}
		System.out.println("Vowels Count:"+vowels);
		System.out.println("Consonants Count:"+consonants);
	}
}
