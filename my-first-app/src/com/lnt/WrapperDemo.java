package com.lnt;

import java.util.ArrayList;
import java.util.List;

public class WrapperDemo {
    public static void main(String[] args) {
        int i = 34;
        // auto-boxing
        Integer j = i;
        // auto-unboxing
        int k = j * 2;
        List list = new ArrayList<>();
        list.add(i);
    }
}
