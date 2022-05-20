package org.test;

public class ElementPresentorNot {
	
	int[] given= {2,1,6,4,3,5,3,3};
	
	int present=3;
	
	boolean found=false;
	
	public void PresentorNot() {
		for(int number:given) {
	    	
	    	if(number==present) {
	    		found=true;
	    		break;
	    	}
	    	
	    }
		if(found) {
    		System.out.println("Present");
    	}
    	else {
			System.out.println("Not Present");
			
		}
	}
    
    
    
	
	public static void main(String[] args) {
		
		ElementPresentorNot elementPresentorNot=new ElementPresentorNot();
		
		elementPresentorNot.PresentorNot();
		
		
	}

}
