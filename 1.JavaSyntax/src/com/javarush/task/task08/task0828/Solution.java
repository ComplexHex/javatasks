package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Номер месяца
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        Map<String,Integer> strings = new HashMap<String, Integer>();
        strings.put("January", 1);
        strings.put("February", 2);
        strings.put("March", 3);
        strings.put("April", 4);
        strings.put("May", 5);
        strings.put("June", 6);
        strings.put("July", 7);
        strings.put("August", 8);
        strings.put("September", 9);
        strings.put("October", 10);
        strings.put("November", 11);
        strings.put("December", 12);

        Set<Map.Entry<String,Integer>> entries = strings.entrySet();
        for (Map.Entry<String,Integer> entry : entries){
            if(entry.getKey().equals(s) ){
                System.out.println((entry.getKey() + " is the " + entry.getValue() + " month"));
            }
        }



    }
}
