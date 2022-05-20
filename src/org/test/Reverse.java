package org.test;

public class Reverse {
	
	public void stringReverse() {
		String given="Agni";
		String store="";
		char[] c = given.toCharArray();
		for (int i =c.length-1;i>=0; i--) {
			store=store+c[i];
		}
		System.out.println(store);
	}
	
	public void reverseAstring() {
		String s="Agni";
		String store="";
		char[] c = s.toCharArray();
		
		for (int i =c.length-1; i>=0; i--) {
			store=store+c[i];
		}
		System.out.println(store);

	}
	
	public void reverseAword() {
		String s="I am honest";
		String store="";
		char[] c = s.toCharArray();
		String[] split = s.split(" ");
		
		for (int i =split.length-1; i>=0; i--) {
			store=store+split[i]+" ";
		}
		System.out.println(store);

	}
	
	public static void main(String[] args) {
		
		Reverse r=new Reverse();
		r.reverseAstring();
		r.reverseAword();
		r.stringReverse();
	}
	

}
