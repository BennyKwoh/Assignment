package Printer;

import java.util.*;

class Test {
	public static void funnyNumbers(int n) {
		int j;
    	for (int i = 999; i < 9999 ; i++) {
    		for (j = 0; j < n;) {	
    		
    		if(String.valueOf(i).contains("7") || i % 7 == 0 || i < 1000 || i > 9999) {
    			
    		} else {
    			System.out.println(i);
    			
    }
    		
    		}
    		j++;}}
	      	    // Driver function  
	    public static void main(String[] args)  
	    { 
	    	
	       funnyNumbers(5);
	    } 
}