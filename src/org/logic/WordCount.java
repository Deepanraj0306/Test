package org.logic;

import java.util.Scanner;

public class WordCount {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the words");
	String string = scanner.nextLine();
	int count=0;
	for (int i = 0;i<=(string.length()-1);i++)
	 {
	if(  ( (i>0)&& (string.charAt(i)!=' ') &&(string.charAt(i-1)==' ')) || ((string.charAt(i)!=' ')&&(i==0)) )
    	  count++;    
	 }
         System.out.println("Number of words in given string:"+count);
	}

}
