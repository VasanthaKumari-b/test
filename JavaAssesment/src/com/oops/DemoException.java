package com.oops;

import java.io.FileNotFoundException;

public class DemoException {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		try{
			int a=25/0;
			System.out.println(a);
		}
		catch(Exception e){
			System.out.println("Array Error");
			
		}
		finally
		{
			System.out.println("Completed");
		}

	}

}
