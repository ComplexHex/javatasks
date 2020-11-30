package com.javarush.task.task04.task0419;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/* 
Максимум четырех чисел
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

        int integ = Integer.parseInt(sAge);
        int integ1 = Integer.parseInt(sAge1);
        int integ2 = Integer.parseInt(sAge2);
        int integ3 = Integer.parseInt(sAge3);

        int max;

        if (integ > 0) {

            if (integ >= integ1 && integ >= integ2 && integ >= integ3)
                System.out.println(integ);
            if (integ1 > integ && integ1 > integ2 && integ1 > integ3)
                System.out.println(integ1);
            if (integ2 > integ && integ2 > integ1 && integ2 > integ3)
                System.out.println(integ2);
            if (integ3 > integ && integ3 > integ2 && integ3 > integ1)
                System.out.println(integ3);

        }
        if (integ < 0) {
            if (-integ < -integ1 && -integ < -integ2 && -integ < -integ3)
                System.out.println(integ);
            if (-integ1 < -integ && -integ1 < -integ2 && -integ1 < -integ3)
                System.out.println(integ1);
            if (-integ2 < -integ && -integ2 < -integ1 && -integ2 < -integ3)
                System.out.println(integ2);
            if (-integ3 < -integ && -integ3 < -integ2 && -integ3 < -integ1)
                System.out.println(integ3);

        }
    }

}



