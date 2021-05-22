package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> al;
        al=new ArrayList<>(0);

        al.add("hi");
        al.add("bye");
        al.add("Mithun");
        al.add("Hassan");
        System.out.println(al);

        al.add(0,"Mahadi");
        al.remove(2);
        al.remove("hi");
        al.set(1,"Hassan");
        al.set(2,"MITHUN");

        System.out.println(al);
        System.out.println(al.get(2)+al.size());
    }
}
