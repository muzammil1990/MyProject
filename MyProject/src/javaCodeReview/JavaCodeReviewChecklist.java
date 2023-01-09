package javaCodeReview;

public class JavaCodeReviewChecklist {

/*	
	1. Ensure the code follows standard naming conventions
	
		Meaningful naming conventions help ensure the readability and maintainability of the application.

		As such, ensure variable, method, and class names
		

		
	2. Make sure it handles constants efficiently
		
		Constants help improve memory as they are cached by the JVM.
		
		For values that are reused across multiple places, create a constant file that holds static values.

		Favor database-driven values over dynamic values. 
		
		Also, use ENUMs to group constants
		
		

	3. Check for proper clean Up
	
		It is common during development to use procedures that help with your coding and debugging (hard coded variables, for example).
		
		It is good practice to remove these items and others such as:

		> Console print statements
		> Unnecessary comments
		> Use @deprecated on method/variable names that aren’t meant for future use
		
		
	
	4. Handle strings appropriately
	
		If you need to perform a lot of operations on a String, use StringBuilder or StringBuffer.

		Strings are immutable, whereas StringBuilder and StringBuffer are mutable and can be changed. 
		Additionally, a new String object is created for every concatenation operation.

		Rather than creating multiple items, using a mutable object is preferred.
	
		
		
	5. Optimize to use switch-case over multiple If-Else statements
		
		Rather than using multiple if-else conditions, use the cleaner and more readable switch-case.

		Doing so makes the logic cleaner and optimizes the app's performance.

		switch(expression) {

		 case x:

			 // code block

			 break;

		 case y:

			 // code block

			 break;

		 default:

			 // code block

		}
		
		
		
	6. Ensure the code follows appropriate error handling procedures
		
		Avoid this:

		public void hello() throws Exception { //Incorrect way

		}

		Try this instead:

		public void hello() throws SpecificException1, SpecificException2 { //Correct way

		}

		Use the try-catch block for exception handling with appropriate actions taken in the catch block.

	    Also, use a finally block to release resources, such as database connections, in the finally block. 
		This allows you to close the resource gracefully.

		
		
	7. Avoid unnecessary comments in code?
				
 		the comment should explain the “why” versus “what” it does.
 		
 		
 	8. Validate that the code follows separation of concerns
 	
 		Ensure there is no duplication. Each class or method should be small and focus on one thing.
 		
 		
 		
 	9. Does the code rely on frameworks rather than custom logic when possible?
 			
 		When time is of the essence, reinventing the wheel is time wasted. There are plenty of proven frameworks and libraries available
 		for the most common use cases you may need.

 		Examples include Apache Commons libraries, and XML/JSON libraries.
 */
	
  }
