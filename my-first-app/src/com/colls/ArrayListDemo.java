package com.colls;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("apple");
        list.add(4);
        list.add(true);

        System.out.println(list.get(2));

        for(Object o : list){
            System.out.println(o);
            if(o instanceof String){
                String str = (String)o;
                System.out.println(str.charAt(0));
            }
          
        }
    }
    
}
