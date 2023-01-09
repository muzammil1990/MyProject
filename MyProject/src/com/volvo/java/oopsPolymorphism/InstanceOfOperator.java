package com.volvo.java.oopsPolymorphism;

//The java instanceof operator is used to test whether the object is an instance of the specified type (class or subclass or interface)

//The instanceof in java is also known as type comparison operator because it compares the instance with type. It returns either true or false.

//If we apply the instanceof operator with any variable that has null value, it returns false.




public class InstanceOfOperator {

	public static void main(String[] args) {
		InstanceOfOperator io= new InstanceOfOperator();
		System.out.println(io instanceof InstanceOfOperator);
	}
}


//An object of subclass type is also a type of parent class.
//For example, if Dog extends Animal then object of Dog can be referred by either Dog or Animal class.

class Animal{
	
}