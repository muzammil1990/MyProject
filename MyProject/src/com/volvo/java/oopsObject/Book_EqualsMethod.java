package com.volvo.java.oopsObject;

public class Book_EqualsMethod {

    String bName;
    String bAuthor;
    int pages;
    
    public Book_EqualsMethod (String bName, String bAuthor, int pages) {
        this.bName = bName;
        this.bAuthor = bAuthor;
        this.pages = pages;
    }
    
    public boolean equals(Object o1){
        
        Book_EqualsMethod b2 = (Book_EqualsMethod) o1;
        return this.bName == b2.bName && this.bAuthor == b2.bAuthor && this.pages == b2.pages;
    }
    

    
    public static void main(String[] args) {
        Book_EqualsMethod b1 = new Book_EqualsMethod("Java", "Author1", 100);
        
        
        Book_EqualsMethod b2 = new Book_EqualsMethod("Java", "Author1", 200);
        System.out.println(b1.equals(b2));  //comparing the address of objects
    }
    
    
    
}
