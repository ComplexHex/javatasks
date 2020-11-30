package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

   static {
       labels.put(12.1, "65465w4");
       labels.put(12.2, "6546ssss54");
       labels.put(12.3, "6546s54");
       labels.put(12.4, "6s54654");
       labels.put(12.5, "6546sss54");
   }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
