package com.mubashir.notes;

public class Miscellaneous {
	
	/**
	 * 1.	NoClassDefFoundError is due to incorect classpath.
	 * 2.	java.lang.Exception occurs when JVM tris to load a particular class and doesnt fint the same in classpath.
	 * 3.	java lang exceptions are checked exceptions.
	 * 4.	ClassNotFoundException will come when JVM tries to load the class at run time
	 * 5.	NoClassDefFoundError will come at compile time.
	 * 6.	UnSupportedClassVersionError is easy to differentiate because it’s related to version of 
	 * 		classpath and usually comes when you compile your code in higher Java version and try to run on lower java version.
	 * 		Can be resolved simply by using one java version for compiling and running your application
	 * 7.	NullPointerException  and ArrayIndexOutOfBoundException  are unchecked exception and derived a runtime.
	 * 
	 * 
	 * 8.	Best Practice for exception handling :- 
	 * 8.1.	Returning boolean instead of returning null to avoid NullPointerException at callers end.
	 * 8.2.	No Non empty catch blocks.
	 * 8.3.	Prefer Unchecked exception over checked until you have a very good reason of not to do so. it improves readability of
			code by removing boiler plate exception handling code
	 * 8.4.	Never let your database Exception flowing till client error.
	 * 8.5.	calling close() methods for connections, statements, and streams on finally block in Java.
	 * 		
	 * 9.	throws keyword is used in method signature to declare which checked exception method can throw,
	 * 		you can also declare unchecked exception, but that is not mandatory by compiler. This signifies lot of things like method is not going 
	 * 		to handle Exception instead its throwing it, if method throws checked Exception then caller should provide compile time exception
	 * 		handling etc
	 * 10.	throw keyword is actually used to throw any Exception.
	 * 11.	What is Exception chaining in Java?.
	 * 		Exception chaining is a popular exception handling concept in Java, where another exception is thrown in 
	 * 		response of an exception and creating a chain of Exceptions. This technique mostly used to wrap a checked exception into an unchecked or
	 * 		RuntimeException. By the way if you are throwing new exception due to another exception then always include original exception so that
	 * 		handler code can access root cause by using methods like getCause() and initCause().
	 * 12.	What changes has been introduced in JDK7 related to Exception handling in Java ?
	 * 		JDK7 has introduced two major feature which is related to Error and Exception handling,  one is ability to handle multiple exception in one
	 * 		catch block, popularly known as multi cache block and other is ARM blocks in Java 7 for automatic resource management, also known as try
	 * 		with resource.
	 * 13.	system.exit se us block mein se nikalta hai and syste,exit(0) se poora bahar.
	 * 
	 * 14.	What is difference in final, finalize and finally keyword in Java?
	 * 		final and finally are keyword, while finalize is method. final keyword is very useful for creating ad Immutable class in Java By making a
	 *  	class final, we prevent it from being extended, similarly by making a method final, we prevent it from being overridden,. On the other hand,
	 *   	finalize() method is called  by garbage collector, before that object is collected, but this is not guaranteed by Java specification.
	 *    	finally keyword is the only one which is related to error and exception handling and you should always have finally block in production
	 *     	code for closing connection and resources.
	 * 15.	As per rules of method overriding in Java, an overridden method can not throw Checked Exception which is higher in hierarchy than 
	 * 		original method.
	 *     
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
			
			
		





	 */
	
}
