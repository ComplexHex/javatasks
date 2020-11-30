package com.javarush.task.task19.task1916;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*     + 1. Класс Solution должен содержать класс LineItem.
        +2. Класс Solution должен содержать enum Type.
        +3. Класс Solution должен содержать публичное статическое поле lines типа List<LineItem>,
        которое сразу проинициализировано.
        +4. В методе main(String[] args) программа должна считывать имена файлов с консоли (используй BufferedReader).
        +5. В методе main(String[] args) BufferedReader для считывания данных с консоли должен быть закрыт.
        6. Программа должна считывать содержимое первого и второго файла (используй FileReader).
        7. Потоки чтения из файлов (FileReader) должны быть закрыты.
        8. Список lines должен содержать объединенную версию строк из файлов, где для каждой строки указана
        одна из операций ADDED, REMOVED, SAME.*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
      /*  String file1 = r.readLine();
        String file2 = r.readLine();*/
       /* FileInputStream file1 = new FileInputStream("C:\\Users\\IMAST\\Desktop\\New.txt");
        FileInputStream file2 = new FileInputStream("C:\\Users\\IMAST\\Desktop\\New1.txt");*/


        //String data = r.readLine();
        BufferedReader reader = new BufferedReader(new FileReader(r.readLine()));
        BufferedReader reader1 = new BufferedReader(new FileReader(r.readLine()));
        r.close();
        ArrayList<String> arrayList = new ArrayList<>();
        ArrayList<String> arrayList1 = new ArrayList<>();

        String line1;
        String line2;
        while ((line1 = reader.readLine()) != null) {
            arrayList.add(line1);
        }
        while ((line2 = reader1.readLine()) != null) {
            arrayList1.add(line2);
        }
        reader.close();
        reader1.close();

        while (arrayList.size() > 0 && arrayList1.size() > 0) {
            if (arrayList.get(0).equals(arrayList1.get(0))) {
                lines.add(new LineItem(Type.SAME, arrayList.get(0)));
                arrayList.remove(0);
                arrayList1.remove(0);
            } else if (arrayList.get(1).equals(arrayList1.get(0))) {
                lines.add(new LineItem(Type.REMOVED, arrayList.get(0)));
                arrayList.remove(0);
            } else /*if (arrayList.get(0).equals(arrayList1.get(1)))*/ {
                lines.add(new LineItem(Type.ADDED, arrayList1.get(0)));
                arrayList1.remove(0);
            }
        }

        while (arrayList1.size() > 0) {
            lines.add(new LineItem(Type.ADDED, arrayList1.get(0)));
            arrayList1.remove(0);
        }


        while (arrayList.size() > 0) {
            lines.add(new LineItem(Type.REMOVED, arrayList.get(0)));
            arrayList.remove(0);
        }

    }

    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}
