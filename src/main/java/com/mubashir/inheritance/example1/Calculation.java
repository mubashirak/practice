package com.mubashir.inheritance.example1;

public class Calculation {
	
	protected int z;
	
	public void addition(int x , int y){
		
		z=x=y;
		System.out.println("Value of  sum is" +z);
		
	}
	public void Subtraction(int x, int y) {
	      z = x - y;
	      System.out.println("The difference between the given numbers:"+z);
	   }

}
