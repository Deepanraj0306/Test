package org.arraylogic;

public class DuplicateElement {
	public static void main(String[] args) {
		
		int array[]= {1,2,6,4,9,2,6};
		
		for (int i = 0; i < array.length; i++) {
		for (int j = i+1; j < array.length; j++) {
			
			if(array[i]==array[j]) {
				System.out.print(array[j]+" ");
			}
		}
			
		}
	}

}
