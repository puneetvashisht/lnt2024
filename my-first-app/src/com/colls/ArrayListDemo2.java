package com.colls;

import java.util.ArrayList;

class Fruit extends Object{
    String name;
    String color;
    public Fruit(String name, String color) {
        this.name = name;
        this.color = color;
    }
    @Override
    public String toString() {
        return "Fruit [name=" + name + ", color=" + color + "]";
    }

    @Override
    public boolean equals(Object obj) {
       Fruit f = (Fruit) obj;
       return this.name.equals(f.name);
    }
    
}

public class ArrayListDemo2 {
    public static void main(String[] args) {
        // ArrayList<String> list = new ArrayList<>();
        // list.add("apple");
        // list.add("grape");
        // list.add("banana");

        ArrayList<Fruit> list = new ArrayList<>();
        list.add(new Fruit("apple", "red"));
        list.add(new Fruit("grapes", "green"));
        list.add(new Fruit("oranges", "orange"));

        System.out.println(list);
        // for(String str : list){
        //     System.out.println(str.charAt(0));
        // }
        Fruit searchFruit = new Fruit("apple", "red");
        System.out.println(list.contains(searchFruit));

        // for(int i=0; i<list.size(); i++){
        //     System.out.println(list.get(0));
        // }



        System.out.println(new Fruit("apple", "red").equals(new Fruit("apple", "green")));

    }
}
