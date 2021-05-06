package com.oops;

 class DemoInheritance {
	int a,b;

	void show(){
		System.out.println("Base class");
	}
}
class Sample01{
		int a,b;
		void show()
		{
			System.out.println("Hello World");
		}
}
class Demoee extends DemoInheritance{
			int a=10;
			void show()
			{
				System.out.println("Child class");
			}
			
	public static void main(String args[]){
		//System.out.println("Heloo Java");
		
		Demoee d=new Demoee();
		d.show();	
}
}
