package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> num = new ArrayList<Integer>();

        ArrayList<Integer> num3 = new ArrayList<Integer>();
        ArrayList<Integer> num2 = new ArrayList<Integer>();
        ArrayList<Integer> numOther = new ArrayList<Integer>();

        for (int i = 0; i < 20; i++) {
            String s = reader.readLine();
            num.add(Integer.parseInt(s));
        }
        for (int i = 0; i < num.size(); i++) {
            Integer x = num.get(i);

            if (x % 3 == 0)
                num3.add(x);
        }
        for (int i = 0; i < num.size(); i++) {
            Integer x = num.get(i);

            if (x % 2 == 0)

                num2.add(x);
        }
        for (int i = 0; i < num.size(); i++) {
            Integer x = num.get(i);


            if (x % 3 != 0)
                if (x % 2 != 0)
                    numOther.add(x);
        }
        printList(num3);
        printList(num2);
        printList(numOther);


    }

    public static void printList(ArrayList<Integer> list) throws IOException {
        //напишите тут ваш код

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

        }


    }

}


