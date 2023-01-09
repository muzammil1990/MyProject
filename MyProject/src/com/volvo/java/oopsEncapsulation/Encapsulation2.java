package com.volvo.java.oopsEncapsulation;

import javax.swing.plaf.synth.SynthSeparatorUI;

class A {

    private int month_no;

    public void setMonthNo(int month_no) {

        if (month_no >= 1 && month_no <= 12) {
            this.month_no = month_no;
        }
    }

    public int getMonthNo() {

        return month_no;
    }

}

public class Encapsulation2 {
    
    public static void main(String[] args) {
        A a = new A();
        
        a.setMonthNo(15);       // setting first time invalid data; will return the default value of the datatype;
        System.out.println(a.getMonthNo());  // output 0
        
        a.setMonthNo(10);
        System.out.println(a.getMonthNo());
        
        a.setMonthNo(20);    // setting invalid data second time; will return the previous valid data;
        System.out.println(a.getMonthNo());  //output; 10
        

    }
}
