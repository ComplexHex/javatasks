package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static Set<Integer> createSet() {
        // напишите тут ваш код
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < 20; i++) {
            set.add(i);
        }

        return set;
    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
        // напишите тут ваш код
        Set<Integer> set2 = new HashSet<Integer>();
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()){
            int n = iterator.next();
            if(n>10){
                set2.add(n);
            }
        }
        set.removeAll(set2);

        return set;

    }

    public static void main(String[] args) {

    }
}
