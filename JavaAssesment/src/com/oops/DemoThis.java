package com.oops;

public class DemoThis {
	int x=150;
	void sample(){
		int x=100;
		System.out.println("Parents classs sample method");
	}
}
	
 class DemoThis02 extends DemoThis {
		int x=10;
		void sample(){
			int x=100;
			System.out.println("It is a child method");
			System.out.println(x);
			System.out.println(this.x);
			System.out.println(super.x);
			super.sample();
		}
          
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoThis02 d=new DemoThis02();
		d.sample();

	}
}
