package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String strDate = reader.readLine();
        SimpleDateFormat formatter1 = new SimpleDateFormat("yyyy-MM-dd");
        Date date = formatter1.parse(strDate);
        SimpleDateFormat formatter2 = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);
        System.out.println(formatter2.format(date).toUpperCase());


    }
}