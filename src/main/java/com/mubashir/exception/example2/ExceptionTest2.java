package com.mubashir.exception.example2;

import java.io.IOException;

public class ExceptionTest2  {
	
	public void start()throws IOException {
		throw new IOException("Not able to open file");
	}
}


