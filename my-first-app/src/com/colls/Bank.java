package com.colls;

import java.util.List;

public class Bank {
    int id;
    String name;
    List<Branch> branch;
    public Bank(int id, String name, List<Branch> branch) {
        this.id = id;
        this.name = name;
        this.branch = branch;
    }
    @Override
    public String toString() {
        return "Bank [id=" + id + ", name=" + name + ", branch=" + branch + "]";
    }

    
}
