package com.javarush.task.task09.task0926;

import java.lang.reflect.Array;
import java.util.ArrayList;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        //напишите тут ваш код
        ArrayList<int[]> arrays = new ArrayList<>();
        arrays.add(new int[5]);
        arrays.add(new int[2]);
        arrays.add(new int[4]);
        arrays.add(new int[7]);
        arrays.add(new int[0]);
        return arrays;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
