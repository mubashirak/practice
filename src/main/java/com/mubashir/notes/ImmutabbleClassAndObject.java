package com.mubashir.notes;

public class ImmutabbleClassAndObject {

	/**1.	Immutable objects offers several benefits over conventional mutable object, especially while creating concurrent Java application. 
	 * 		Immutable object not only guarantees safe publication of object’s state, but also can be shared among other threads without any 
	 * 		external synchronization.
	 *2.	Immutable objects are those, whose state can not be changed once created e.g. java.lang.String, once created can not be 
	 *		modified e.g. trim, uppercase, lowercase. All modification in String result in new object.
	 *3.	How to write immutable class in Java
			Despite of few disadvantages, Immutable object still offers several benefits in multi-threaded programming and it’s 
			a great choice to achieve thread safety in Java code. here are few rules, which helps to make a class immutable in Java :.
	 *3.1	State of immutable object can not be modified after construction, any modification should result in new immutable object.
	 *3.2 	All fields of Immutable class should be final.
	 *3.3	Object must be properly constructed i.e. object reference must not leak during construction process.
	 *3.4	Object should be final in order to restrict sub-class for altering immutability of parent class.
	 * 
	 *4.	We can create create immutable object by violating few rules, like String has its hashcode in non final field, but its 
	 *		always guaranteed to be same. No matter how many times you calculate it, because it’s calculated from final fields, which
	 *		is guaranteed to be same. 
	 *5.	Immutable classes are thread safe.
	 *6.	Immutable object simplifies development, because its easier to share between multiple threads without external synchronization
	 *7.	Immutable object boost performance of Java application by reducing synchronization in code.
	 *8.	Another important benefit of Immutable objects is reusability, you can cache Immutable object and reuse them, much like String
	 *	 	literals and Integers.  You can use static factory methods to provide methods like valueOf(), which can return an existing Immutable
	 *		object from cache, instead of creating a new one.
	 * 
	 * 
	 * 
	 * 
	 */
}
