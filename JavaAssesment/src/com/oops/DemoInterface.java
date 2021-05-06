package com.oops;

interface  DemoInterface{

	
	public void  add();
}

interface Sath{
	public void sub();
	
}
 class Inteppp implements DemoInterface,Sath{
	
	public void add(){
		System.out.println("aaa");
	}
	
	public void sub(){
		System.out.println("bbbb");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Inteppp ip=new Inteppp();
     ip.add();
	}
}

