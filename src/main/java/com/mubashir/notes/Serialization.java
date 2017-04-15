package com.mubashir.notes;

public class Serialization {
	
	/**
	 * serialization is the process which is used to serialize object in java by storing object’s state into a file with extension .ser and recreating 
	 * object's state from that file, this reverse process is called deserialization.
	 * 
	 * Serializable vs Externalization in Java
		difference between Java Serialization vs Externalization in Javahere are some more differences between Serializable and
		Externalizable interface in Java:
		1. In case of Serializable, default serialization process is used. while in case of Externalizable custom Serialization process is used 
		which is implemented by application.
	 * 2. JVM gives call back to readExternel() and writeExternal() of java.io.Externalizalbe interface for restoring and writing objects into 
	 * persistence.
	 * 3. Externalizable interface provides complete control of serialization process to application.
		4. readExternal() and writeExternal() supersede any specific implementation of writeObject and readObject methods.
		Read more: http://javarevisited.blogspot.com/2012/01/serializable-externalizable-in-java.html#ixzz4eFbZnVOH
	 * http://javarevisited.blogspot.in/2011/04/top-10-java-serialization-interview.html
	 * 
	 * 
	 */

}
