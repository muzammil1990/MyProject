package com.volvo.java.oopsEncapsulation;

class Data {

    private int monthNo;

    public void setMonthNo(int monthNo) {
        if (monthNo >= 1 && monthNo <= 12) {
            this.monthNo = monthNo;
        }

    }

    public int getMonthNo() {
        return monthNo;
    }

}

public class Practice {

    public static void main(String[] args) {
        
        Data d= new Data();
        d.setMonthNo(12);
        System.out.println(d.getMonthNo());
        
        d.setMonthNo(101);
        System.out.println(d.getMonthNo());
        
        d.setMonthNo(1);
        System.out.println(d.getMonthNo());
       
        d.setMonthNo(39);
        System.out.println(d.getMonthNo());

    }
}
