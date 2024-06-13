package com.lnt;

class StringDemo {
    public static void main(String[] args) {
        String str = new String("abc");
        String str2 = "abc";
        String result = str2.substring(0, 2);
        System.out.println(str2);
        System.out.println(result);

        if(str == str2){
            System.out.println("same ref..");
        }

        if(str.equals(str2)){
            System.out.println("same content");
        }
    }
}