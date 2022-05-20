package org.logic;

public class LinearSearch {
	public static void main(String[] args) {
		
		int [] array= {20,50,10,60,40,30};
		int number=30;
		
		for (int i = 0; i < array.length; i++) {
			if(number==array[i]) {
				System.out.println(number+" is present at "+(i+1)+"th place");
			}
			
		}
	}
}
