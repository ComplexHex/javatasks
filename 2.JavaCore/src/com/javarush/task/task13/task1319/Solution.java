package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();


        BufferedWriter writer = new BufferedWriter(new FileWriter(name));
        String line = "";
        while (true) {
            writer.write(line + "\r\n");
            writer.flush();
            if ((line = reader.readLine()).equals("exit")) {
                writer.write(line + "\r\n");
                break;
            }
        }

        writer.close();

    }

}
