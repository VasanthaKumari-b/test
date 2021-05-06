package com.sample;

public class DemoReverseArray {

	public static void main(String[] args) {
		int[] array={1,2,3,4,5,6};
		System.out.println("Array lnegth is:"+array.length);
		
		for(int i=array.length-1;i>=0;i--){
					System.out.print(array[i]);
		}

	}

}
