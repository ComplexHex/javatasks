package com.javarush.task.task22.task2211;

import org.omg.CORBA.portable.OutputStream;

import java.io.*;
import java.nio.charset.Charset;

/*В метод main первым параметром приходит имя файла, тело которого в кодировке Windows-1251.
        В метод main вторым параметром приходит имя файла, в который необходимо записать содержимое первого файла
         в кодировке UTF-8.


        Требования:
        1. Программа НЕ должна считывать данные с клавиатуры.
        2. Программа НЕ должна выводить данные на экран.
        3. Программа должна записывать данные в файл.
        4. Содержимое второго файла должно соответствовать содержимому первого файла за исключением кодировки(UTF-8).*/

public class Solution {
    public static void main(String[] args) throws IOException {

        Charset windows1251 = Charset.forName("Windows-1251");
        Charset utf8 = Charset.forName("UTF-8");
        FileInputStream inputStream = new FileInputStream(args[0]);
        FileOutputStream outputStream = new FileOutputStream(args[1]);

        byte[] buffer = new byte[1000];
        inputStream.read(buffer);
        String s = new String(buffer, windows1251);
        buffer = s.getBytes(utf8);
        outputStream.write(buffer);
    }
}
