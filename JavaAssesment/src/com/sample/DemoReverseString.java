package com.sample;

public class DemoReverseString {

	public static void main(String[] args) {
		
		String s="Vasanthakumari";
		
		char[] input=s.toCharArray();
		System.out.println(input);
		
		for(int i=input.length-1;i>=0;i--){
			
			System.out.print(input[i]);
		}
		
	}

}
