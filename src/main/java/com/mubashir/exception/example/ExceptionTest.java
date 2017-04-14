package com.mubashir.exception.example;

import java.io.IOException;

public class ExceptionTest {
	public static void start() throws IOException, RuntimeException{
	    throw new RuntimeException("Not able to Start");
	 }

	 public static void main(String args[]) {
	    try {
	          start();
	    } catch (Exception ex) {
	            ex.printStackTrace();
	   /* }  (RuntimeException re) {
	            re.printStackTrace();*/
	    }
	 }

// isme runtime wala comment karna pada kunki sab exception ne hi sab catch kar liya.. neeche kuch ni aya
}
