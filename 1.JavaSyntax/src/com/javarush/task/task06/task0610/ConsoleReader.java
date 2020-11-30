package com.javarush.task.task06.task0610;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/* 
Класс ConsoleReader
*/

public class ConsoleReader {
    public static String readString() throws Exception {
        //напишите тут ваш код
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String sAge = bufferedReader.readLine();

        return sAge;


    }

    public static int readInt() throws Exception {
        //напишите тут ваш код
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String sAge = bufferedReader.readLine();

        int num = Integer.parseInt(sAge);

        return num;
    }

    public static double readDouble() throws Exception {
        //напишите тут ваш код
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String sDoNum = bufferedReader.readLine();

        double dnum = Double.parseDouble(sDoNum);
        return dnum;
    }

    public static boolean readBoolean() throws Exception {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String sAge = bufferedReader.readLine();

        boolean bool = Boolean.parseBoolean(sAge);
        return bool;

    }

    public static void main(String[] args) throws Exception {

    }
}
