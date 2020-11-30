package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        FileInputStream fileInputStream = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
        TreeSet<Integer> list = new TreeSet<Integer>();

        while (fileInputStream.available() > 0) {
            list.add( fileInputStream.read());
        } fileInputStream.close();


        for (int i : list) {
            System.out.print(i + " ");
        }


    }
}
