package org.logic;

import java.util.Scanner;

public class Prime {
public static void main(String[] args) {
	
	int i,count;
    System.out.print("Enter the Number : ");
	    System.out.println("Prime numbers between 1 to "+100+" are ");
	for(int j=2;j<=100;j++)
	{
	count=0;
	for(i=1;i<=j;i++)
	{
	if(j%i==0)
	{
	 count++;        
	}
	}
	if(count==2)
	System.out.print(j+"  ");     
	}
	}
	}
