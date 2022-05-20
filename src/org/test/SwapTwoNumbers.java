package org.test;

public class SwapTwoNumbers {
	
	public void usingThirdVariable() {
		
        int mysalary=20;
		
		int superiorsalary=50;
		
		System.out.println("Before Swapping mysalary :"+ mysalary+"\n superiorsalary :"+superiorsalary);
		
		int temp=mysalary;
		mysalary=superiorsalary;
		superiorsalary=temp;
		
		System.out.println("After Swapping mysalary :"+ mysalary+"\n superiorsalary :"+superiorsalary);
	}
	
	public void withoutThirdVariable() {
		
        int mysalary=20;
		
		int superiorsalary=50;
		
		System.out.println("Before Swapping mysalary :"+ mysalary+"\n superiorsalary :"+superiorsalary);	
		
		mysalary=mysalary-superiorsalary;
		superiorsalary=mysalary+superiorsalary;
		mysalary=superiorsalary-mysalary;
		System.out.println("After Swapping mysalary :"+ mysalary+"\n superiorsalary :"+superiorsalary);
	}

	public static void main(String[] args) {
		
		SwapTwoNumbers swap=new SwapTwoNumbers();
		
		swap.withoutThirdVariable();
		}
}
