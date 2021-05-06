package com.sample;

public class DemoArmStrong {

	public static void main(String[] args) {
             int num=153;
             int a,sum=0;
             int temp =num;
             
             while(num>0){
            	 a=num%10;
            	 System.out.println(a);
            	 num=num/10;
            	 System.out.println(num);
            	 sum=sum+(a*a*a);
   	              }
		if(sum==temp){
			System.out.println("Given number palindrom");
		}else{
			System.out.println("not Palindram");
		}
	}

}
