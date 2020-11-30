package com.javarush.task.task18.task1826;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
                 /*  fileName - имя файла, который необходимо зашифровать/расшифровать.
                fileOutputName - имя файла, куда необходимо записать результат шифрования/дешифрования.
                -e - ключ указывает, что необходимо зашифровать данные.
                -d - ключ указывает, что необходимо расшифровать данные.


                Требования:
        1. Считывать с консоли ничего не нужно.
        2. Создай поток для чтения из файла, который приходит вторым параметром ([fileName]).
        3. Создай поток для записи в файл, который приходит третьим параметром ([fileOutputName]).
        4. В режиме "-e" программа должна зашифровать [fileName] и записать в [fileOutputName].
        5. В режиме "-d" программа должна расшифровать [fileName] и записать в [fileOutputName].
        6. Созданные для файлов потоки должны быть закрыты.*/


        FileInputStream fileInputStream = new FileInputStream(args[1]);
        FileOutputStream fileOutputStream = new FileOutputStream(args[2]);

        if (args[0].equals("-e")) {
            while (fileInputStream.available() > 0) {
                fileOutputStream.write(fileInputStream.read() -2);
            }
        }
        else if (args[0].equals("-d")) {
            while (fileInputStream.available() > 0) {
                fileOutputStream.write(fileInputStream.read() +2);
            }
        }
        fileInputStream.close();
        fileOutputStream.close();




/*
        FileInputStream fileInputStream = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
        FileInputStream inputStream = new FileInputStream("c:/data.txt");
        // Создаем поток-записи-байт-в-файл
        FileOutputStream outputStream = new FileOutputStream("c:/result.txt");


        if (inputStream.available() > 0) {
            //читаем весь файл одним куском
            byte[] buffer = new byte[inputStream.available()];
            int count = inputStream.read(buffer);
            outputStream.write(buffer, 0, count);
        }

        inputStream.close();
        outputStream.close();
    }
*/


    }

}
