package com.sample;

public class DemoStringPalindrom {

	public static void main(String[] args) {
     String s= "madam";
     String temp=" ";
     int n = s.length();
     for(int i = n - 1; i >= 0; --i)
     {
         temp = temp + s.charAt(i);
     }
     if(s.equals(temp))
     {
         System.out.println("The string is palindrome.");
     }
     else
     {
         System.out.println("The string is not palindrome.");
     }
 }
}