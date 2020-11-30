package com.javarush.task.task07.task0707;

import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<String>();

        list.add("adsf");
        list.add("adsf1");
        list.add("adsf2");
        list.add("adsf3");
        list.add("adsf4");

        System.out.println(list.size());

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

        }
    }
}
