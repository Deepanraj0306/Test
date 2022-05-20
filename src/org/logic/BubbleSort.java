package org.logic;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int []array= {20,10,40,60,50,30};
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length-1-i; j++) {
				if(array[j]>array[j+1]) {
					int swap=array[j];
					array[j]=array[j+1];
					array[j+1]=swap;
				}
			}
		}
		
		System.out.println("Bubble Sort : "+Arrays.toString(array));
	}
	
}
