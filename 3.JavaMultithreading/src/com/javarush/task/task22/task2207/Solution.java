package com.javarush.task.task22.task2207;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/* 
Обращенные слова
*/

public class Solution {
    public static List<Pair> result = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
        StringBuilder stringBuilder = new StringBuilder();

        String s = "";
        while ((s=fileReader.readLine())!=null){
            stringBuilder.append(s);
            stringBuilder.append(" ");
        }

        String st = String.valueOf(stringBuilder).replace("\uFEFF", "");
        StringBuilder stringBuilder1 = new StringBuilder(st);
        s = stringBuilder1.substring(0, stringBuilder.length()-1);


        String[] sArr = s.split(" ");
        for(int i = 0; i < sArr.length-1; i++){
            for (int j = i+1; j < sArr.length; j++){
                StringBuilder str = new StringBuilder(sArr[j]);
                str.reverse();

                String s1 = String.valueOf(str);

                Pair pair = new Pair();
                pair.first = sArr[i];
                pair.second = s1;

                if (pair.second.equals(pair.first)){
                    pair.second = sArr[j];
                    result.add(pair);
                    sArr[j] = "str"+i;
                    break;
                }
            }
        }



        for (Pair p : result){
            System.out.println(String.format("%s %s", p.first, p.second));
        }

        fileReader.close();
        reader.close();
    }
    public static class Pair {
        String first;
        String second;



        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Pair pair = (Pair) o;

            if (first != null ? !first.equals(pair.first) : pair.first != null) return false;
            return second != null ? second.equals(pair.second) : pair.second == null;

        }

        @Override
        public int hashCode() {
            int result = first != null ? first.hashCode() : 0;
            result = 31 * result + (second != null ? second.hashCode() : 0);
            return result;
        }

        @Override
        public String toString() {
            return first == null && second == null ? "" :
                    first == null ? second :
                            second == null ? first :
                                    first.compareTo(second) < 0 ? first + " " + second : second + " " + first;

        }
    }

}
