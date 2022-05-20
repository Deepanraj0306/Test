package org.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ReverseAstring {
	
	public void function() {
		String s="Agni";
		
		StringBuffer buffer=new StringBuffer();
		buffer.append(s);
		
		System.out.println(buffer.reverse());
		
	}
	
	public void ownLogic() {
		
		String given="Agni";
		
		String store="";
		
		char[] charArray = given.toCharArray();
		
		for (int i=charArray.length-1;i>=0;i--) {
			
			store=store+charArray[i];
		}
		
		System.out.println(store);
	}
	
	public void usingCollections() {
         String s="Agni";
		
		char[] charArray = s.toCharArray();
		
		List<Character> list=new ArrayList<Character>();
		
		for (Character character : charArray) {
			list.add(character);
		}
		
		Collections.reverse(list);
		
		ListIterator iterator=list.listIterator();
		
		while(iterator.hasNext()) {
			
			System.out.println(iterator.next());
		}
		
	}
	
	public static void main(String[] args) {
		
		ReverseAstring astring=new ReverseAstring();
		
		astring.usingCollections();
	}

}
