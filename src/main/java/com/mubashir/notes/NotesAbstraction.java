package com.mubashir.notes;

public class NotesAbstraction {

	/**
	1.Abstraction is achieved in java by abstract class and interface class.
	2.Abstract method doesnt have body it's just a declaration.
	3.Use abstraction only if know something needs to be in class but implementation would vary.
	you cannot create instance of abstract class by new()
	4.Abstract class can have constructor
	5.Abstract is a keyword which can be used with class and method.
	6.Abstract class can have both abstract and concrete method
	7.class automatically becomes abstract if one of its method is made abstract.
	8.variables cannot be made abstract.
	9.if a class extends abstract class it has to provide implementation to all methods to be a concrete class.
	10.1) Can abstract class have constructors in Java?
		Yes, abstract class can declare and define constructor in Java. Since you can not create instance of abstract class,  constructor can only be called during constructor chaining, i.e. when you create instance of concrete implementation class. 
	11.Can abstract class implements interface in Java? does they require to implement all methods?
		Yes, abstract class can implement interface by using implements keyword. Since they are abstract, they don’t need to implement all methods. It’s good practice to provide an abstract base class, along with an interface to declare Type. One example of this is java.util.List interface and corresponding java.util.AbstractList abstract class.
	12.http://javarevisited.blogspot.in/2013/04/10-abstract-class-and-interface-interview-question-java-answers.html
	
	**/
}
