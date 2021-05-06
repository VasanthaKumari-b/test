package com.test;

public class ArrayOddNumbers {

		public static void main (String args[]) {

		int i; 
		int array[] = {12,9,4,99,120,1,3,10};

		

		System.out.print("Odd numbers:");

		for(i = 0; i < array.length; i++)
		{
			if(array[i]%2!=0)
			{
				
				System.out.println(array[i]);
			}
		}

		}
		}