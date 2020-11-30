package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args) {

    }

    static {
        //add your code here - добавьте код тут
     reset();
    }

    public static CanFly result;

    public static void reset() {
        //add your code here - добавьте код тут

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String name;
            name = reader.readLine();

            if (name.equals("helicopter")) {
                Helicopter helicopter = new Helicopter();
                result = helicopter;
            }
            if (name.equals("plane")) {
                String name1;
                name1 = reader.readLine();
                int count1;
                count1 = Integer.parseInt(name1);

                Plane plane = new Plane(count1);
                result = plane;
            }


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
