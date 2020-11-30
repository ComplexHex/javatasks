package com.javarush.task.task19.task1911;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/*        5. Метод main(String[] args) класса Solution должен создавать поток PrintStream (используй PrintStream c
         конструктором принимающим ByteArrayOutputStream).
        6. Метод main(String[] args) класса Solution должен подменять и восстанавливать поток вывода в консоль
        объекта System.out.
        7. Метод main(String[] args) класса Solution должен вызывать метод printSomething(),объекта testString.
        8. Метод main(String[] args) класса Solution должен модифицировать строку выведенную методом printSomething()
         согласно заданию, и выводить её в консоль.*/

public class Solution {

    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);

        testString.printSomething();
        String result = outputStream.toString().toUpperCase();
        System.setOut(consoleStream);

       /* StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.toString().toUpperCase();
        String upperString = stringBuilder.toString();*/

        System.out.println(result);

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}
