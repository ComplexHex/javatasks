package com.javarush.task.task19.task1907;

import java.io.*;

/*Считать с консоли имя файла.
        Файл содержит слова, разделенные знаками препинания.
        Вывести в консоль количество слов "world", которые встречаются в файле.
        Закрыть потоки.

        Требования:
        1. Программа должна считывать имя файла с консоли (используй BufferedReader).
        2. BufferedReader для считывания данных с консоли должен быть закрыт.
        3. Программа должна считывать содержимое файла (используй FileReader c конструктором принимающим String).
        4. Поток чтения из файла (FileReader) должен быть закрыт.
        5. Программа должна выводить в консоль количество слов "world", которые встречаются в файле.
        "C:\\Users\\IMAST\\Desktop\\New.txt"*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        FileReader reader = new FileReader(r.readLine());

       r.close();
        int count=0;
        while (reader.ready()){



        }reader.close();
        System.out.println(count);
    }
}
