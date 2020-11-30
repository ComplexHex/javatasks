package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код

        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String sAge = bufferedReader.readLine();

        int num = Integer.parseInt(sAge);


        while(num > 0) {
            if ( num % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            num = num / 10;
        }


        System.out.println("Even: " + even + " Odd: " + odd);
    }
}
