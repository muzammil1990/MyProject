package com.volvo.jave.Construtorchaining;

class LoginPage {

    public LoginPage() {
        System.out.println("LoginPage");
    }
}

class HomePage extends LoginPage {

    public HomePage() {
        System.out.println("HomePage");
    }
}

public class InterviewConstructor {
    public static void main(String[] args) {
//        LoginPage l = new LoginPage(); 
//        HomePage h = new HomePage(); 
        
        LoginPage l2 = new HomePage(); 
    }
}
