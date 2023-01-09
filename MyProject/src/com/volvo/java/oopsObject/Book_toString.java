package com.volvo.java.oopsObject;

public class Book_toString {
    
    String bName;
    String bAuthor;
    int pages;
    
    public Book_toString(String bName, String bAuthor, int pages) {
        this.bName = bName;
        this.bAuthor = bAuthor;
        this.pages = pages;
    }
    
//    public String toString(){
//        return "Book name is: " +bName+ ", Author is: "+bName +", pages: "+pages;
//    }
    
    public static void main(String[] args) {
        Book_toString b1 = new Book_toString("Java", "Author1", 100);
        System.out.println(b1);   //here it will print the address of object
                                 // why?  Because when we try to print a reference variable, it calls the toString() of Object class by default
                                 //Sytem.out.println(b1.toString());
                                 //And in Object class, toString() is used to return the address of the reference variable.
                                 //So if we want a meaning output like what exactly the object holds, we need to override toString() in our class
                        // run without overriding toString() to see the difference in output
    }
    
    

}
