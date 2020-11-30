package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Клубок
*/

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        threads.add(new Thread(new Thread1()));
        threads.add(new Thread(new Thread2()));
        threads.add(new Thread(new Thread3()));
        threads.add(new Thread4());
        threads.add(new Thread(new Thread5()));
    }


    public static void main(String[] args) {
    }

    public static class Thread1 extends Thread {
        @Override
        public void run() {
            while (true) ;
        }
    }

    public static class Thread2 extends Thread {
        @Override
        public void run() {
            try {
                while (true) {
                    Thread.sleep(1);
                }
            } catch (InterruptedException interruptedException) {
                System.out.println("InterruptedException");
            }
        }
    }

    public static class Thread3 extends Thread {
        @Override
        public void run() {
            try {
                while (true) {
                    System.out.println("Ура");
                    Thread.sleep(500);
                }
            } catch (InterruptedException interruptedException) {

            }
        }
    }

    public static class Thread4 extends Thread implements Message{
        @Override
        public void run() {
            while (!this.isInterrupted()) {
            }
        }

        public void showWarning() {
            this.interrupt();
        }
    }

    public static class Thread5 extends Thread {

        @Override
        public void run() {

            try {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

                int sum = 0;
                String line = "";
                while (!(line = reader.readLine()).equals("N")) {
                    sum += Integer.parseInt(line);
                }
                reader.close();
                System.out.println(sum);
            } catch (IOException e) {

            }

        }
    }

}