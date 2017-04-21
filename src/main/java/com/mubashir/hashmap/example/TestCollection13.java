package com.mubashir.hashmap.example;

import java.util.HashMap;
import java.util.Map;


public class TestCollection13 {

	
	public static void main (String args []){
		
		HashMap <Integer,String> hm = new HashMap<Integer,String>();
		
		hm.put(10, "Test");
		hm.put(20, "Test2");
		for(Map.Entry m:hm.entrySet()){  
			   System.out.println(m.getKey()+" "+m.getValue());  
			  }  
		
		
	}
}
