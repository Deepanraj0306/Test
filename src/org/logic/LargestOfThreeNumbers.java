package org.logic;

import java.util.Scanner;

public class LargestOfThreeNumbers {
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the FirstNumber:");
		
		int firstNumber = scanner.nextInt();
		
		System.out.println("Enter the SecondNumber:");
		
		int secondNumber = scanner.nextInt();
		
		System.out.println("Enter the ThirdNumber:");
		
		int thirdNumber = scanner.nextInt();
		
		if(firstNumber>=secondNumber && firstNumber>=thirdNumber) {
			
			System.out.println("Larget of Among the three Number is :"+firstNumber);
		}
		
		else if(secondNumber>=thirdNumber && secondNumber>=firstNumber){
			
			System.out.println("Larget of Among the three Number is :"+secondNumber);
		}
		
		else {
			
			System.out.println("Larget of Among the three Number is :"+thirdNumber);
		}
	}

}
