package org.test;

public class ReverseAword {

	public static void main(String[] args) {
		
		String given="i love Agni";
		
		String reverse="";
		
		String[] temp = given.split(" ");
		
		System.out.println(temp.length);
		
		for (int i=temp.length-1; i>=0; i--) {
			
			reverse=reverse+temp[i]+" ";
			
		}
		
		System.out.println(reverse);
	}
}
