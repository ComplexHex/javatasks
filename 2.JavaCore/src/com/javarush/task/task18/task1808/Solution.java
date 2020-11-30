package com.javarush.task.task18.task1808;

import java.io.*;

/* 
Разделение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        FileInputStream inputStream = new FileInputStream(reader.readLine());
        FileOutputStream outputStream = new FileOutputStream(reader.readLine());
        FileOutputStream outputStream1 = new FileOutputStream(reader.readLine());

        byte[] buffer = new byte[inputStream.available()];
        int total = inputStream.read(buffer);
        int half = total - (total/2);

        outputStream.write(buffer, 0 ,half);
        outputStream1.write(buffer, half, total-half);

        inputStream.close();
        outputStream.close();
        outputStream1.close();
    }
}
