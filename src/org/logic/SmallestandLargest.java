package org.logic;

public class SmallestandLargest {
	public static void main(String[] args) {
		
		int array[]= {20,10,40,50,30};
		
		int smallest=array[0];
		int largest=array[0];
		
		for (int i = 0; i < array.length; i++) {
			
	if(array[i]<smallest) {
		smallest=array[i];
	}
	
	if(array[i]>largest) {
		largest=array[i];
	}
		}
		System.out.print("Smallest value :"+smallest+"\nLargest value : "+largest);
	}

}
