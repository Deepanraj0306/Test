package org.logic;

public class GivenstringisPalindrome {
	public static void main(String[] args) {
		
		String s="AAAA";
		String store="";
		
		char[] charArray = s.toCharArray();
		
		for (int i =charArray.length-1; i>=0; i--) {
			
			store=store+charArray[i];
			
		}
		
		System.out.println(store);
		
		if(s.equals(store)) {
			
			System.out.println("String is Palindrome");
		}
		
		else {
			
			System.out.println("String is not Palindrome");
		}
	}

}
