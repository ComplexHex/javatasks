package com.javarush.task.task19.task1910;

import java.io.*;
import java.util.ArrayList;
/*Считать с консоли 2 имени файла.
        Первый Файл содержит текст.
        Считать содержимое первого файла, удалить все знаки пунктуации, включая символы новой строки.
        Результат вывести во второй файл.
        Закрыть потоки.

        Требования:
        1. Программа должна считывать имена файлов с консоли (используй BufferedReader).
        2. BufferedReader для считывания данных с консоли должен быть закрыт.
        3. Программа должна считывать содержимое первого файла (используй BufferedReader c конструктором FileReader).
        4. Поток чтения из файла (BufferedReader) должен быть закрыт.
        5. Программа должна записывать во второй файл содержимое первого файла, где удалены все знаки пунктуации, включая символы новой строки (Для записи в файл используй BufferedWriter с конструктором FileWriter).
        6. Поток записи в файл (BufferedWriter) должен быть закрыт.*/

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        BufferedReader reader = new BufferedReader(new FileReader(r.readLine()));
        BufferedWriter writer = new BufferedWriter(new FileWriter(r.readLine()));
        r.close();

        while (reader.ready()) {
            {
                String data = reader.readLine();
                writer.write(data.replaceAll("\\p{Punct}", ""));


            }
        }reader.close();
        writer.close();
    }
}
