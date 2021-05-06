package com.sample;

public class DemoNumPalindrom {

	public static void main(String[] args) {
     int num=121;
     int reminder,reverse=0;
     int temp= num;
     
     while(num>0){
    	  reminder=num%10;
    	 reverse=(reverse*10)+reminder;
    	 num=num/10;
     }
     if(temp==reverse){
    	 System.out.println("Given number is palindrom");
     }else{
    	 System.out.println("Given number is not  palindrom");
     }
	}

}
