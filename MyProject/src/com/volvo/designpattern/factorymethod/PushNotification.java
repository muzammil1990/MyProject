package com.volvo.designpattern.factorymethod;

public class PushNotification implements Notification{

	@Override
	public void notifyUser() {
		// TODO Auto-generated method stub
		
		 System.out.println("Sending a push notification");
	}
	
//	 In short, we are trying to achieve Pseudo polymorphism by letting the subclass to decide what to create, 
//	 and so this Factory method is also called a virtual constructor.

}
