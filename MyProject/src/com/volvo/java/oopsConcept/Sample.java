package com.volvo.java.oopsConcept;

 class Sample1{
    
    void get() {
        System.out.println("hi");
    }

    static String write() {
        return "writing";
    }
    
    
}

public class Sample extends Sample1  {

    void wet(){
        System.out.println("bye");
    }
    
    void read() {
        System.out.println("finised writing");
    }
    
    static int add(){
        return 10+20;
    }
    public static void main(String[] args) {

        Sample s= new Sample();
        s.wet();
        s.read();
        s.get();
        s.write();
        s.add();
    }

}
