package com.volvo.java.Collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

//pg to observe that insertion order is preserve i.e. insertion order remains same
public class LinkedHashSet_Ex1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        LinkedHashSet lhs = new LinkedHashSet();

        lhs.add("one");
        lhs.add("two");
        lhs.add("four");
        lhs.add("four");
        lhs.add("five");
        lhs.add(null);

//         System.out.print(lhs);

        Iterator<String> i = lhs.iterator();

        while (i.hasNext()) {
            
            System.out.println(i.next());
        }

        /*
         * for (Object s : lhs) { System.out.println(s); }
         */

    }

}
