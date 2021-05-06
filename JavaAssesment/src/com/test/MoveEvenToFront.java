package com.test;

public class MoveEvenToFront {

	static int[] testcase1 = { 3, 5, 4, 6, 8, 9, 7, 10 };

	public static void main(String[] args) {

		MoveEvenToFront testInstance = new MoveEvenToFront();

		int[] result = testInstance.moveEvenToFront(testcase1);

		System.out.print("{");

		for (int i = 0; i < result.length; i++) {

			if (i > 0) {

				System.out.print(",");

			}

			System.out.print(result[i]);

		}

		System.out.print("}");

	}

	public int[] moveEvenToFront(int[] arr) {

		int temp = 0;

		int a = 0;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] % 2 == 0) {

				for (int j = i; j > a; j--) {

					temp = arr[j - 1];

					arr[j - 1] = arr[j];

					arr[j] = temp;

				}

				a++;

			}

		}

		return arr;

	}

}