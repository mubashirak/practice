package com.mubashir.notes;

public class Miscellaneous {
	
	/*
	 * 1.	NoClassDefFoundError is due to incorect classpath.
	 * 
	 * 2.	java.lang.Exception occurs when JVM tris to load a particular class and doesnt fint the same in classpath.
	 * 
	 * 3.	java lang exceptions are checked exceptions.
	 * 
	 * 4.	ClassNotFoundException will come when JVM tries to load the class at run time
	 * 
	 * 5.	NoClassDefFoundError will come at compile time.
	 * 
	 * 6.	UnSupportedClassVersionError is easy to differentiate because it’s related to version of 
	 * 		classpath and usually comes when you compile your code in higher Java version and try to run on lower java version.
	 * 		Can be resolved simply by using one java version for compiling and running your application
	 * 
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
	 * 
	 * 10.	throw keyword is actually used to throw any Exception.
	 * 
	 * 11.	What is Exception chaining in Java?.
	 * 		Exception chaining is a popular exception handling concept in Java, where another exception is thrown in 
	 * 		response of an exception and creating a chain of Exceptions. This technique mostly used to wrap a checked exception into an unchecked or
	 * 		RuntimeException. By the way if you are throwing new exception due to another exception then always include original exception so that
	 * 		handler code can access root cause by using methods like getCause() and initCause().
	 * 
	 * 12.	What changes has been introduced in JDK7 related to Exception handling in Java ?
	 * 		JDK7 has introduced two major feature which is related to Error and Exception handling,  one is ability to handle multiple exception in one
	 * 		catch block, popularly known as multi cache block and other is ARM blocks in Java 7 for automatic resource management, also known as try
	 * 		with resource.
	 * 
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
	 * 16.	how do you manipulate String in Java without creating String garbage? StringBuilder and StringBuffer are the answer to this question. 
	 * 		StringBuffer is old class but StringBuilder is newly added in Java 5 along with major improvements in Enum, Generics, varargs methods 
	 * 		and Autoboxing in Java.
	 * 
	 * 17.	you cannot cast StringBuilder to StirngBuffer or StringBuilder to String in Java. It will throw java.lang.ClasscastException, if you 
	 * 		tried to cast even StringBuffer to String in Java.
	 * 
	 * 18.	String buffer vs String Builder
	 * 		string buffer is thread safe whereas string buider is not.
	 * 		string buffer is synchronized 
	 * 		string buffer is slower
	 * 
	 * 19.	What is autoboxing and unboxing in Java
	 * 		When Java automatically converts a primitive type like int into corresponding wrapper class object e.g. Integer than its called autoboxing 
	 *  	because primitive is boxed into wrapper class while in opposite case is called unboxing, where an Integer object is converted into primitive
	 *   	int. All primitive types e.g. byte, short, char, int, long, float, double and boolean has corresponding wrapper class e.g. Byte, Short, 
	 *   	Integer, Character etc and participate in autoboxing and unboxing. Since the whole process happens automatically without writing any code
	 *    	for conversion its called autoboxing and auto-unboxing.
	 * 		
	 * 20.	Important point about Autoboxing and Unboxing in Java
			1) Compiler uses valueOf() method to convert primitive to Object and uses intValue(),
			doubleValue() etc to get primitive value from Object.
			2)  During autoboxing boolean is converted to Boolean, byte to Byte, char converted to Character, float changes to Float, 
			int goes to Integer, long goes to Long and short converts to Short, while in unboxing opposite happens like Float to float.
			Read more: http://javarevisited.blogspot.com/2012/07/auto-boxing-and-unboxing-in-java-be.html#ixzz4eEJ2XeA6
	 * 
	 * 21.	how exactly substring method works, until they have not seen the code of java.lang.String. If you look substring method inside String 
	 * 		class, you will figure out that it calls String (int offset, int count, char value []) constructor to create new String object. 
	 * 		What is interesting here is, value[], which is the same character array used to represent original string.
	 * 
	 * 22. 	Integer to String
	 * 		String price = String.valueOf(123);
	 * 		String price = String.format ("%d", 123);
	 * 		new StringBuilder().append( "" ).append( 10 ).toString();
	 * 
	 * 23.	Why do we need Synchronization in Java?
	 * 		If your code is executing in a multi-threaded environment, you need synchronization for objects, which are shared among multiple threads,
	 *  	to avoid any corruption of state or any kind of unexpected behavior.
	 * 
	 * 24.	Synchronization in Java will only be needed if shared object is mutable. if your shared object is either read-only or immutable object, 
	 *		then you don't need synchronization, despite running multiple threads.
	 * 
	 * 25.	In Summary, Java synchronized Keyword provides following functionality essential for concurrent programming:
	 * 		1) The synchronized keyword in Java provides locking, which ensures mutually exclusive access to the shared resource
	 *  	and prevents data race.
	 *  
	 * 26.	1) Use Checked Exception for Recoverable error and Unchecked Exception for programming error.
	 * 		2) Close or release resource in finally block
	 *  	3) Including cause of Exception in stack-trace
	 *  	4) Always provide meaning full message on Exception
	 *  	5) Avoid overusing Checked Exception
	 *  	6) Converting Checked Exception into RuntimeException
	 *  	7) Remember Exceptions are costly in terms of performance
	 *  	8) Avoid empty catch blocks
	 *  	9) Use Standard Exceptions
	 *  	10) Document Exception thrown by any method
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
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
