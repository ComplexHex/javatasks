package com.javarush.task.task03.task0318;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/* 
План по захвату мира
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String sAge = bufferedReader.readLine();
        String name = bufferedReader.readLine();
        int nAge = Integer.parseInt(sAge);

        System.out.println(name+ " захватит мир через " + sAge + " лет. Му-ха-ха!");

    }
}
