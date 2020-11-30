package com.javarush.task.task04.task0427;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Описываем числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String A = reader.readLine();
        int a = Integer.parseInt(A);

        if(a>=1 && a<=999){
            if(a%2==0 && A.length()==1){
                System.out.println("четное однозначное число");
            }
            else if(a%2!=0 && A.length()==1){
                System.out.println("нечетное однозначное число");
            }
            else if(a%2==0 && A.length()==2){
                System.out.println("четное двузначное число");
            }
            else if(a%2!=0 && A.length()==2){
                System.out.println("нечетное двузначное число");
            }
            else if(a%2==0 && A.length()==3){
                System.out.println("четное трехзначное число");
            }
            else if(a%2!=0 && A.length()==3){
                System.out.println("нечетное трехзначное число");
            }
        }
    }
}
