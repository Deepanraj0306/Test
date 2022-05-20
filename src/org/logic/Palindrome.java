package org.logic;

import java.util.Scanner;

public class Palindrome {
public static void main(String[] args) {
	int pal=0;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the Number and Check it is Palindrome or Not:");
	int num = s.nextInt();
	int original=num;
	
	while(num>0) {
		int temp=num%10;
		pal=pal*10+temp;
		num=num/10;
	}
	if(pal==original) {
		System.out.println("Palindrome");
	}
	else {
		System.out.println("Not Palindrome");
	}
}
}
