package com.oops;

public class DemoOverLoading {
	String s;
	 int x;
//////consturctor overloading/////
	DemoOverLoading(String s){
		this.s=s;
		System.out.println(s);
	}
	DemoOverLoading(int x){
		this.x=x;
		System.out.println(x);
	}
//////Method overloading/////
	public void add(){
		System.out.println("aaa");
	}
	public void add(int x){
		
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoOverLoading dm=new DemoOverLoading("Vasantha");
		DemoOverLoading dmd=new DemoOverLoading(12);

				dm.add();
				dm.add(12);

	}

}
