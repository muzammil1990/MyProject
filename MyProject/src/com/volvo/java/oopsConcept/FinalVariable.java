package com.volvo.java.oopsConcept;

/*Rules:
    1. Final variable should always be initialised
    2. Final variable values cannot be reinitialised or re-assigned
    3. The only modifier which can be used with local vairable is "FINAL"
    
other non access modifiers are: static, abstract, synchronized, native, volatile, transient
*/
public class FinalVariable {

    
    final static int b = 30;
    static int a = 10;
    
    static final String s1 = "Java";
    static String s2= "python";

    public static void main(String[] args) {

        a = 30; 
        b = 50;  //cannot reinitialize since final var
        s1 = "Selenium";  //cannot reinitialize since final var
        s2="ML";
      abstract int x=35;  // cannot use non access modifier with local variable other than final
      native double y=98; 
      transient char ch='c';
      volatile float f=10.0f;
    }
}
