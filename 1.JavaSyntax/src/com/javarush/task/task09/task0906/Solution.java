package com.javarush.task.task09.task0906;

/* 
Логирование стек-трейса
*/

public class Solution {
    public static void main(String[] args) {
        log("In main method");
    }

    public static void log(String text) {
        //напишите тут ваш код
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();


        String cN = Thread.currentThread().getStackTrace()[2].getClassName();
        String mN =Thread.currentThread().getStackTrace()[2].getMethodName();
        String s = text;
        System.out.println(cN + ": " + mN + ": " + s );
    }
}

