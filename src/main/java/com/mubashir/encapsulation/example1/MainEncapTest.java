package com.mubashir.encapsulation.example1;

public class MainEncapTest {
	
	public static void main (String [] args){
		
		EncapTest test = new EncapTest();
		
		test.setAge("12");
		test.setName("Mu");
		
		System.out.println("name is " + test.getName()+" and Age is  " +test.getAge());
	// why getter and setter are private??
	}

}
