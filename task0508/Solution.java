package com.javarush.task.pro.task05.task0508;

import java.util.Scanner;

/* 
Удаляем одинаковые строки
*/

public class Solution {
    public static String[] strings;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // считываются 6 строк
        strings = new String[6];
        for (int i = 0; i < 6; i++) {
            strings[i] = scanner.nextLine();
        }
        // проходимся циклом по массиву
        for (int i = 0; i < strings.length; i++) {
            String currentString = strings[i]; // инициализируем текущую строку
            for (int j = i + 1; j < strings.length; j++) { // подключаем второй цикл для сравнения
                if (currentString == null) {
                    break;
                }
                if (currentString.equals(strings[j])) {
                    strings[i] = null;
                    strings[j] = null;
                }
            }
        }

        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ", ");
        }
    }
}
