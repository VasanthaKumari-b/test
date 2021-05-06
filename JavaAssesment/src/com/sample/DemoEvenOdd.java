package com.sample;

public class DemoEvenOdd {

	public static void main(String[] args) {
		int[] array={78, 34, 1, 3, 90, 34, -1, -4, 6, 55, 20, -65};
	     
	     for(int i=0;i<array.length;i++){
	    	 if(array[i]%2!=0){
	    		 System.out.println("odd numbers:");
	    		 System.out.print(array[i]);
	    	 }else{
	    		 System.out.println("Even numbers:");
	    		 System.out.print(array[i]);
	    	 }
	     }
	}

}
