package com.javarush.task.task19.task1920;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.TreeMap;

/*В метод main первым параметром приходит имя файла.
        В этом файле каждая строка имеет следующий вид:
        имя значение
        где [имя] - String, [значение] - double. [имя] и [значение] разделены пробелом.

        Для каждого имени посчитать сумму всех его значений.
        Вывести в консоль имена в алфавитном порядке, у которых максимальная сумма.
        Имена разделять пробелом либо выводить с новой строки.
        Закрыть потоки.

        Пример входного файла:
        Петров 0.501
        Иванов 1.35
        Петров 0.85

        Пример вывода:
        Петров


        Требования:
        1. Программа НЕ должна считывать данные с консоли.
        2. Программа должна считывать содержимое файла (используй FileReader).
        3. Поток чтения из файла (FileReader) должен быть закрыт.
        4. Программа должна выводить в консоль имена, у которых максимальная сумма.*/

public class Solution {
    public static void main(String[] args) throws IOException {

        TreeMap<String, Double> map = new TreeMap<String, Double>();
       // BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\IMAST\\Desktop\\New.txt"));
         BufferedReader reader = new BufferedReader(new FileReader(args[0]));


        String line1;
        while ((line1 = reader.readLine()) != null) {
            String[] parts = line1.split(" ");
            map.merge(parts[0], Double.valueOf(parts[1]), (a, b) -> a + Double.valueOf(parts[1]));


        }
        reader.close();
        map.forEach((String,Double)->{
            if (Double.equals(Collections.max(map.values()))) { System.out.println(String);} });
            }
        }


