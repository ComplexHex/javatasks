package com.javarush.task.task14.task1419;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) throws CloneNotSupportedException {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() throws CloneNotSupportedException {   //the first exception
       /* try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        //напишите тут ваш код

        try {
            throw new NumberFormatException("asdf");
        } catch (NegativeArraySizeException negativeArraySizeException) {
            exceptions.add(negativeArraySizeException);
        }


        try {
            throw new NumberFormatException("asdf");
        } catch (NumberFormatException numberFormatException) {
            exceptions.add(numberFormatException);
        }

        try {
            throw new IllegalArgumentException("asdf");
        } catch (IllegalArgumentException illegalArgumentException) {
            exceptions.add(illegalArgumentException);
        }

        try {
            throw new IndexOutOfBoundsException("asdf");
        } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            exceptions.add(indexOutOfBoundsException);
        }

        try {
            throw new FileNotFoundException("awd");
        } catch (FileNotFoundException fileNotFoundException) {
            exceptions.add(fileNotFoundException);
        }

        try {
            throw new ArithmeticException("asdf");
        } catch (ArithmeticException arithmeticException) {
            exceptions.add(arithmeticException);
        }

        try {
            throw new ArrayIndexOutOfBoundsException("asdf");
        } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            exceptions.add(arrayIndexOutOfBoundsException);
        }

        try {
            throw new IllegalStateException("asdf");
        } catch (IllegalStateException illegalStateException) {
            exceptions.add(illegalStateException);
        }

        try {
            throw new UnsupportedOperationException("asdf");
        } catch (UnsupportedOperationException unsupportedOperationException) {
            exceptions.add(unsupportedOperationException);
        }*/

     /*   try {
            throw new StringIndexOutOfBoundsException("asdf");
        } catch (StringIndexOutOfBoundsException stringIndexOutOfBoundsException) {
            exceptions.add(stringIndexOutOfBoundsException);
        }
*/


        Collections.addAll(exceptions, new NegativeArraySizeException(), new NumberFormatException(),
                new IllegalArgumentException(), new IndexOutOfBoundsException(),
                new FileNotFoundException(), new ArithmeticException(),
                new  ArrayIndexOutOfBoundsException(), new IllegalStateException(),
                new UnsupportedOperationException(), new StringIndexOutOfBoundsException());
    }
}
