package com.test;

public class Palindrome {

	public static void main(String[] args) {

		int num = 121, reversedInteger = 0, remainder, temp;

		temp = num;

		// reversed integer is stored in variable

		while (num != 0)

		{

			remainder = num % 10;

			reversedInteger = reversedInteger * 10 + remainder;

			num = num / 10;

		}

		// palindrome if orignalInteger and reversedInteger are equal

		if (temp == reversedInteger)

			System.out.println(temp + " is a palindrome.");

		else

			System.out.println(temp + " is not a palindrome.");

	}

}