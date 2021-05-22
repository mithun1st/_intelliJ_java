package com.company;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    
    public static HashMap <String,ArrayList<String>> hm;
    public static ArrayList<String> drinks;
    public static ArrayList<String> tea;
    public static ArrayList<String> coffee;
    public static ArrayList<String> cappuccino;

    public static void main(String[] args) {
        hm=new HashMap<>(0);

        drinks=new ArrayList<>(0);

        tea=new ArrayList<>(0);
        coffee=new ArrayList<>(0);
        cappuccino=new ArrayList<>(0);

        //drinks
        drinks.add("TEA");
        drinks.add("COFFEE");
        drinks.add("CAPPUCCINO");

        //tea
        tea.add("sugar");
        tea.add("teaLeaf");

        //coffee
        coffee.add("beans");
        coffee.add("coffeePower");
        coffee.add("coldWater");

        //cappuccino
        cappuccino.add("power");
        cappuccino.add("milk");
        cappuccino.add("hotWater");

        //HashMap
        hm.put(drinks.get(0),tea);
        hm.put(drinks.get(1),coffee);
        hm.put(drinks.get(2),cappuccino);

        for(String s : drinks){
            System.out.println(s+" = "+hm.get(s));
        }


        //hm.replace("TEA",cappuccino);
        //hm.remove("TEA");
        //hm.clear();

        for(String s : drinks){
            //System.out.println("-\t"+s+" = "+hm.get(s));
        }

    }
}
