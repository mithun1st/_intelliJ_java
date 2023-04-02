package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2));
        Set<Integer> set = new HashSet<>(Arrays.asList(1,2,1));
        HashMap<String,Integer> map=new HashMap<>(){
            {
                put("a",1);
                put("b",2);
            }
        };
        
        list.add(3);
        set.add(4);
        map.put("c", 3);

        System.out.println(list);
        System.out.println(set);
        System.out.println(map);
    }
}
