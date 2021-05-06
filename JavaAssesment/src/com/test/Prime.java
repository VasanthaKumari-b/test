package com.test;

public class Prime {

	public static void main(String[] args) {

		int n = 0, i = 0;
		String primenumbers = " ";

		for (i = 1; i <= 10; i++) {
			int count = 0;

			for (n = i; n >= 1; n--) {
				if (i % n == 0) {
					count = count + 1;
				}
			}
			if (count == 2) {
				primenumbers = primenumbers + i + " ";

			}
		}
		System.out.println("PrimeNumbers:");
		System.out.println(primenumbers);
	}
}