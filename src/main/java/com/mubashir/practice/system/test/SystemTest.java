package com.mubashir.practice.system.test;

public class SystemTest {

	public static void main(String Args[]) {

		System.getenv();
	//	System.out.println("System.get enviornment is " + System.getenv());

		System.class.getName();
		//System.out.println(" system.class name is" + System.class.getName());
		
		System.currentTimeMillis();
		
		//System.out.println(System.currentTimeMillis());
		System.getProperties();
	//	System.out.println(System.getProperties());
		
		System.getSecurityManager();
		System.gc();
		//System.out.println(System.getSecurityManager().getSecurityContext());
		
		//System.inheritedChannel().close();
	}
}
