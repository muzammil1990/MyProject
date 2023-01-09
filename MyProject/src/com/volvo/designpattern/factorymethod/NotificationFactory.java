package com.volvo.designpattern.factorymethod;

// Create a factory class NotificationFactory.java to instantiate concrete class.

public class NotificationFactory {

	//non static method with return type Notification (interface)
	
	public Notification createNotification(String channel) {
		if (channel == null || channel.isEmpty())
			return null;
		
		switch (channel) {
		case "SMS":
			return new SMSNotification();
			
		case "EMAIL":
			return new EmailNotification();
			
		case "PUSH":
			return new PushNotification();
			
		default:
			throw new IllegalArgumentException("Unknown channel " + channel);
		}
	}
}
