package com.colls;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankTest {
   public static void main(String[] args) {
    Branch b1 = new Branch(23, "Branch1", "Kormangla");
    Branch b2 = new Branch(3, "Branch2", "Whitefield");
    List<Branch> branches = new ArrayList<>();
    branches.add(b1);
    branches.add(b2);

    //
    Bank bank = new Bank(2, "ICICI", branches);
    System.out.println(bank);

    Map<String, Bank> bankMap = new HashMap<>();
    bankMap.put("icici", bank);

    System.out.println(bankMap);
    
   } 
}
