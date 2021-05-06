package com.oops;

public class DemoOverRiding {
	public void add(){
		System.out.println("parent");
	}
}
class DemoOverRiding01 extends DemoOverRiding {
	public void add(){
		
		System.out.println("child");
		super.add();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoOverRiding01 dm=new DemoOverRiding01();
				dm.add();
				

	}
}


	
	


