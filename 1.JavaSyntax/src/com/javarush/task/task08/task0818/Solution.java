package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        //напишите тут ваш код

        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("asd112", 12301);
        map.put("asd121", 12302);
        map.put("asd1212", 12130);
        map.put("asd122", 122230);
        map.put("asd1122", 12230);
        map.put("asd11122", 1230);
        map.put("asd212", 12230);
        map.put("as2d12", 10);
        map.put("a2sd12", 30);
        map.put("a22sd12", 130);

        return map;

    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        //напишите тут ваш код

        Map<String, Integer> copy = new HashMap<>(map);
        for (Map.Entry<String, Integer> pair : copy.entrySet()) {
            if (pair.getValue() < 500) {
                map.remove(pair.getKey());
            }
        }}

        public static void main (String[]args){

        }
    }