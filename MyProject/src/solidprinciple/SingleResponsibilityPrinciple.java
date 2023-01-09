package solidprinciple;
/*
1. The single responsibility principle states that every Java class must perform a single functionality. 
2. Implementation of multiple functionalities in a single class mashup the code and if any modification is required may affect the whole class. 
3. It precise the code and the code can be easily maintained.

eg:

Suppose, Student is a class having three methods namely printDetails(), calculatePercentage(), and addStudent(). 
Hence, the Student class has three responsibilities to print the details of students, calculate percentages, and add student in database. 
By using the single responsibility principle, 
      we can separate these functionalities into three separate classes to fulfill the goal of the principle.


*/

public class SingleResponsibilityPrinciple {
	
	public void printDetails() {
		// functionality of the method
	}
	
	public void calculatePercentage() {
		// functionality of the method
	}

	public void addStudent() {
		// functionality of the method
	}
}


//The above code snippet violates the single responsibility principle.
//To achieve the goal of the principle, we should implement a separate class that performs a single functionality only.

//practically implemented in Listener class in framework