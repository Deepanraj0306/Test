package org.logic;

public class ReverseAstring {
	public static void main(String[] args) {
		
		String s="Agni";
		
		String store="";
		
		char[] charArray = s.toCharArray();
		
		for (int i =charArray.length-1; i>=0; i--) {
			
			store=store+charArray[i];
		}
		
		
		System.out.println(store);
	}

}
