package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        FileInputStream fileInputStream = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
        Set<Byte> list=new HashSet<>();

        while (fileInputStream.available()>0){
            list.add((byte)fileInputStream.read());
        }

                  for( int i : list){
                      System.out.println(i);
                  }

        fileInputStream.close();
    }
}
