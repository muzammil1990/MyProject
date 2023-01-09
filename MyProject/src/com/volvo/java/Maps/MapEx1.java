package com.volvo.java.Maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEx1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Map m = new HashMap();
        m.put(1, "Muzammil");
        m.put(200, "Tarkeshwar@yahoo.com");
        m.put(101, 123);

        //print the values of map: how?? 
        // Traversing Map
        Set s = m.entrySet();  //Converting map to Set so that we can traverse

        Iterator itr = s.iterator();

        while (itr.hasNext()) {
                                                    //Decalration: public Set<Map.Entry<K,V>> entrySet()
            Map.Entry me = (Map.Entry) itr.next();//(Typecasted to map.entry) // to print the value in map, we use another interface i.e. Map.Entry

            System.out.println("Values entered in the map are:-  " + me.getKey() + "  " + me.getValue());
        }

        // map key value can also be traversed and retrieved this old way
        // while (itr.hasNext()) {
        //
        // System.out.println(itr.next());
        // }

    }

}
