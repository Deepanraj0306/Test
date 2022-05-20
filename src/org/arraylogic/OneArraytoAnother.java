package org.arraylogic;

public class OneArraytoAnother {
	public static void main(String[] args) {
		int array1[]=new int[] {1,4,2,3,5};
		
		int array2[]=new int[array1.length];
		
		for(int i=0;i<array1.length;i++) {
			array2[i]=array1[i];
		}
		
		for(int i=0;i<array2.length;i++) {
			
			System.out.print(array2[i]+" ");
		}
	}
	
	

}
