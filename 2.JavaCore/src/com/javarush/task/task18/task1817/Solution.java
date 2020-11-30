package com.javarush.task.task18.task1817;

import java.io.FileInputStream;
import java.io.IOException;

/* 
Пробелы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
       /* В метод main первым параметром приходит имя файла.
        Вывести на экран соотношение количества пробелов к количеству всех символов. Например, 10.45.
        1. Посчитать количество всех символов.
        2. Посчитать количество пробелов.
        3. Вывести на экран п2/п1*100, округлив до 2 знаков после запятой.
        4. Закрыть потоки.


        Требования:
        1. Считывать с консоли ничего не нужно.
        2. Создай поток чтения из файла, который приходит первым параметром в main.
        3. Посчитай отношение пробелов ко всем символам в файле и выведи в консоль это число.
        4. Выведенное значение необходимо округлить до 2 знаков после запятой.
        5. Поток чтения из файла должен быть закрыт.*/

        // C:\Users\IMAST\Desktop\New.txt

        FileInputStream fileInputStream = new FileInputStream(args[0]);
        float count = 0;
        float total = 0;
        while (fileInputStream.available() > 0) {
            int i = fileInputStream.read();
            if ((i == 32)) {
                count++;
            } else {
                total++;
            }
        }
        fileInputStream.close();
        float ratio = 0;
        ratio = ((((float) ( count) /(float)(total+ count))) * 100f );

        System.out.println(String.format("%.2f", ratio));
    }
}


