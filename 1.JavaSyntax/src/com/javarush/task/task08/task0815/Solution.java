package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("asd12", "qwe1");
        map.put("asd1", "qwe2");
        map.put("asd2", "qwe43");
        map.put("asd3", "qwe");
        map.put("asd4", "qwe");
        map.put("asd21", "qwe5");
        map.put("asd22", "qwe6");
        map.put("asd7", "qwe87");
        map.put("asd8", "qwe7");
        map.put("asd9", "qwe8");


        return map;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        int a = 0;

        for (HashMap.Entry<String, String> pair : map.entrySet()) {
            if (name.equals(pair.getValue())) {
                //if (pair.getValue().equals(name)) {
                a++;}
        }
        return a;
    }//напишите тут ваш код



    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        int a = 0;
        for (HashMap.Entry<String, String> pair : map.entrySet()) {
            if (lastName.equals(pair.getKey())) {
                //if (pair.getKey().equals(lastName)) {
                a++;}
        }
        return a;
        //напишите тут ваш код

    }

    public static void main(String[] args) {

    }
}
