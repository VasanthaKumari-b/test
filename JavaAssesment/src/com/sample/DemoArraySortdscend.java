package com.sample;

public class DemoArraySortdscend {

	public static void main(String[] args) {
		int[] array={78, 34, 1, 3, 90, 34, -1, -4, 6, 55, 20, -65};
	     
	     for(int i=0;i<array.length;i++){
	    	 for(int j=i+1;j<array.length;j++){
	    		 int temp=0;
	    		 if(array[i]<array[j]){
	    			 temp=array[i];
	    			 array[i]=array[j];
	    			 array[j]=temp;
	    		 }
	    		 
	    	 }
	    	 System.out.println(array[i]);
	     }
		}

	}
