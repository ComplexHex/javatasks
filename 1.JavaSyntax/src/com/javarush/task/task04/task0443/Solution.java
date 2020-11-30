package com.javarush.task.task04.task0443;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/* 
Как назвали, так назвали
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String sAge = bufferedReader.readLine();
        String sAge1 = bufferedReader.readLine();
        String sAge2 = bufferedReader.readLine();
        String sAge3 = bufferedReader.readLine();

        int num = Integer.parseInt(sAge1);
        int num1 = Integer.parseInt(sAge2);
        int num2 = Integer.parseInt(sAge3);

        System.out.println("Меня зовут " + sAge + "." + "\n" + "Я родился " + num2 + "." + num1 + "."+ num);
    }
}
