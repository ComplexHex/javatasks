package com.javarush.task.task18.task1818;

import java.io.*;

/* 
Два в одном
*/

public class Solution {
    public static void main(String[] args) throws IOException {
       /* Считать с консоли 3 имени файла.
        Записать в первый файл содержимого второго файла, а потом дописать в первый файл содержимое третьего файла.
        Закрыть потоки.


        Требования:
        1. Программа должна три раза считать имена файлов с консоли.
        2. Для первого файла создай поток для записи. Для двух других - потоки для чтения.
        3. Содержимое второго файла нужно переписать в первый файл.
        4. Содержимое третьего файла нужно дописать в первый файл (в который уже записан второй файл).
        5. Созданные для файлов потоки должны быть закрыты.*/
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String file1 = r.readLine(); //считываем имена трех файлов
        String file2 = r.readLine();
        String file3 = r.readLine();

        FileOutputStream writer = new FileOutputStream(file1);
        FileInputStream reader = new FileInputStream(file2);

        byte[] buffer = new byte[reader.available()];
        reader.read(buffer); //Читаю сразу второй файл
        writer.write(buffer);
        reader.close();

        reader = new FileInputStream(file3);
        buffer = new byte[reader.available()];  //Переназначаю читать третий файл
        reader.read(buffer); //Читаю сразу третий файл
        writer.write(buffer);

        writer.close();
        reader.close();



       /* while (fileInputStream.available() > 0) {
            fileOutputStream.write(fileInputStream.read() -2);*/

    }
}
