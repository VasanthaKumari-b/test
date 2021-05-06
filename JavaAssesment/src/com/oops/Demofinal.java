package com.oops;

 public class Demofinal {
	
    final int x;
	int y=15;
	//static int x=10;
	private int v=56;
	
	 Demofinal(){
		x=1345;
		System.out.println(x);
	}
	public final void show(){
	 int x=4444;
		int z=x+y;
		System.out.println(x);
	}
	
	private int showTest(){
		int z=x+y;
		return z;
	}
	
	
	public class DemoEx1 extends Demofinal
	{
		public  void show(int a){
			
				System.out.println("heloo");
			}
			
	}
	public static void main(String args[]){
    		Demofinal de=new Demofinal();
    	//	DemoEx1 de1=new DemoEx1();
    		de.show();
    		System.out.println(de.showTest());
    		//System.out.println(DemoEx.x);
    		//System.out.println(de1.v);
	}

}
