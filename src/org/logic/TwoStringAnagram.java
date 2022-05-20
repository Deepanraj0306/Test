package org.logic;

import java.util.Arrays;

public class TwoStringAnagram {
	public static void main(String[] args) {
		String s1="listen";
		String s2="silent";
		
		
		if(s1.length()==s2.length()) {
			
			char[] ch1 = s1.toCharArray();
			char[] ch2 = s2.toCharArray();
			
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			//boolean anagram = Arrays.equals(ch1,ch2);
			if(String.valueOf(ch1).equals(String.valueOf(ch2))) {
				System.out.println("String is Anagram");
			}
			else {
				System.out.println("String is Not Anagram");
			}
		}
		else {
			System.out.println("String is Not Anagram");
		}
		
	}

}
