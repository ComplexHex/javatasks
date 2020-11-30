package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleMap();
        printPeopleMap(map);
    }

    public static Map<String, String> createPeopleMap() {
        //напишите тут ваш код
        Map<String,String> map = new HashMap<String, String>();
        map.put("asdf1", "asf1");
        map.put("asdf", "asf2");
        map.put("asdf3", "asf3");
        map.put("asdf4", "asf4");
        map.put("asdf5", "asf5");
        map.put("asdf", "asf6");
        map.put("asdf", "asf7");
        map.put("asdf8", "asf");
        map.put("asdf7", "asf");
        map.put("asdf6", "asf");


        return map;
    }

    public static void printPeopleMap(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
