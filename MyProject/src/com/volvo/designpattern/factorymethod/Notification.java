package com.volvo.designpattern.factorymethod;


/*A Factory Pattern or Factory Method Pattern says that just define an interface or abstract class for creating an object but 
 * let the subclasses decide which class to instantiate. In other words, subclasses are responsible to create the instance/object of the class.

The Factory Method Pattern is also known as Virtual Constructor.*/

//Read theory from -        https://www.geeksforgeeks.org/factory-method-design-pattern-in-java/



// follow FactoryMethodPattern.PNG in package

// In the above class diagram, we have an interface called Notification, and three concrete classes.
// are implementing the Notification interface. A factory class - NotificationFactory is created to get a Notification object.


public interface Notification {
	
   void notifyUser();
}




/*Real-time examples:

This design pattern has been widely used in JDK, such as 

1. getInstance() method of java.util.Calendar, NumberFormat, and ResourceBundle uses factory method design pattern. 
2. All the wrapper classes like Integer, Boolean etc, in Java uses this pattern to evaluate the values using valueOf() method. 
3. java.nio.charset.Charset.forName(), java.sql.DriverManager#getConnection(), java.net.URL.openConnection(), java.lang.Class.newInstance(),
   java.lang.Class.forName() are some of their example where factory method design pattern has been used.*/