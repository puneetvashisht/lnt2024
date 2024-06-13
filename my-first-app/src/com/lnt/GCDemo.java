package com.lnt;

public class GCDemo {
    public static void main(String[] args) {
        // String str = "";
        StringBuffer sb = new StringBuffer("");
        for(int i=0;i<1000000; i++){
            // str = str + i;
            sb.append(i);
        }
        System.out.println(sb.toString());
    }
}
