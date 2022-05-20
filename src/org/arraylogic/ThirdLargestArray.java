package org.arraylogic;

public class ThirdLargestArray {
	public static void main(String[] args) {
		int array[]= {50,30,40,10,20,70,60};
		
		int largest=array.length;
		for (int i = 0; i < largest; i++) {
			
			for (int j =i+1; j <largest; j++) {
				
				if(array[i]>array[j]) {
				
				int temp=0;
				
				temp=array[i];
				array[i]=array[j];
				array[j]=temp;
				
				}
				
			}
		}
		System.out.print(array[largest-3]);
	}
}
