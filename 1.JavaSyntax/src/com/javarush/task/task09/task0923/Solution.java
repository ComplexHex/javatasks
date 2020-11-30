package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Reader r = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(r);
        String s = reader.readLine();

        String str2 = s.replaceAll(" ", "");

        for (int i = 0; i < str2.length(); i++) {
            if (isVowel(str2.charAt(i))) {
                System.out.print(str2.charAt(i) + " ");
            }
            //

        }
        System.out.println();
        for (int i = 0; i < str2.length(); i++) {
            if ((!isVowel(str2.charAt(i)))) {
                System.out.print(str2.charAt(i) + " ");
            }

        }
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char character) {
        character = Character.toLowerCase(character);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char vowel : vowels) {  // ищем среди массива гласных
            if (character == vowel) {
                return true;
            }
        }
        return false;
    }
}
