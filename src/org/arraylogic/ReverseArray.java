package org.arraylogic;

public class ReverseArray {
	public static void main(String[] args) {
		int [] array= {11,10,9,8,7};
		
		for (int i =array.length-1; i>=0; i--) {
			System.out.print(array[i]+"  ");
		}
	}
}
