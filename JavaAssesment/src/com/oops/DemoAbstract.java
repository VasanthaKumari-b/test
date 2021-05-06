package com.oops;

abstract class DemoAbstract {

	public int add() {
		return 0;
	}

	abstract int sub();
}

class D1 extends DemoAbstract {

	int sub() {
		return 0;
	}

	public static void main(String args[]) {

		D1 dd = new D1();
		System.out.println(dd.add());
		dd.sub();
	}
}
