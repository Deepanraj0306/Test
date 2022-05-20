package org.logic;

import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
		int arm=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number :");
		int num = s.nextInt();
		int original=num;
		
		while(num>0) {
			int temp=num%10;
			arm=arm+(temp*temp*temp);
			num=num/10;
			
		}
		
		if(arm==original) {
			System.out.println("Armstrong Number");
		}
		else {
			System.out.println("Not Armstrong Number");
		}
	}

}
