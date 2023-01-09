package com.volvo.designpattern.factorymethod;

//Now let’s use factory class to create object of concrete class and 
//get an object of concrete class by passing some information.

public class NotificationService {
	
	public static void main(String[] args)
    {
        NotificationFactory notificationFactory = new NotificationFactory();
        Notification notification = notificationFactory.createNotification("EMAIL");
        notification.notifyUser();
    }
}
