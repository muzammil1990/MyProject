package instanceofoperator;

//An object of subclass type is also a type of parent class. For example, if Dog extends Animal then object of Dog 
//can be referred by either Dog or Animal class.

class Animal {
}



public class Dog extends Animal {  //Dog inherits Animal  

	public static void main(String[] args) {
		Dog d = new Dog();

		System.out.println(d instanceof Animal);
	}
}
