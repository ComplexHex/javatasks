package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collections;

/*      1. Введи с клавиатуры 10 слов в список строк.
        2. Определить, является ли список упорядоченным по возрастанию длины строки.
        3. В случае отрицательного ответа вывести на экран индекс первого элемента, нарушающего такую упорядоченность.

        Требования:
        1. Объяви переменную типа список строк и сразу проинициализируй ee.
        2. Считай 10 строк с клавиатуры и добавь их в список.
        3. Если список упорядочен по возрастанию длины строки, то ничего выводить не нужно.
        4. Если список не упорядочен по возрастанию длины строки, то нужно вывести на экран индекс первого элемента,
         нарушающего такую упорядоченность.*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<>();
        Reader r = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(r);
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s);
        }

     /*   ArrayList<String> list1 = new ArrayList<>(list);
        Collections.sort(list1);*/

        for (int i = 0; i < list.size()-1; i++) {
            String slist = list.get(i);
            String slist1 = list.get(i+1);
            if (slist1.length() <= slist.length()){
                System.out.println(i+1);
                break;
            }
        }

    }
}

