package com.mubashir.exception.example2;
/*
public class SubClass extends ExceptionTest2{  
    public void start() throws Exception{
        throw new Exception("Not able to start");
    }
}*/
// In this code compiler will complain on sub class where start() method gets
// overridden. As per rules of method overriding in Java, an overridden method
// can not throw Checked Exception which is higher in hierarchy than original
// method. Since here start() is throwing IOException in super class, start() in
// sub class can only throw either IOException or any sub class of IOException
// but not super class of IOException e.g. Exception.

