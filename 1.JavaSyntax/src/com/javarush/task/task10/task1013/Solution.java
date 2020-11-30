package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // Напишите тут ваши переменные и конструкторы
        private int age;
        private int height;
        private int weight;
        private boolean sex;
        private String name;
        private String color;

        public Human(int age, int height, int weight, boolean sex, String name, String color) {
            this.age = age;
            this.height = height;
            this.weight = weight;
            this.sex = sex;
            this.name = name;
            this.color = color;
        }

        public Human(int age, int height, int weight, boolean sex, String name) {
            this.age = age;
            this.height = height;
            this.weight = weight;
            this.sex = sex;
            this.name = name;
        }

        public Human(int age, int height, int weight, boolean sex) {
            this.age = age;
            this.height = height;
            this.weight = weight;
            this.sex = sex;
        }

        public Human(int age, int height, int weight) {
            this.age = age;
            this.height = height;
            this.weight = weight;
        }

        public Human(int age, int height) {
            this.age = age;
            this.height = height;
        }

        public Human(int age) {
            this.age = age;
        }

        public Human(int age, int height, int weight,  String name, String color) {
            this.age = age;
            this.height = height;
            this.weight = weight;
            this.sex = sex;
            this.name = name;
            this.color = color;
        }
        public Human(int age, int height, int weight,   String color) {
            this.age = age;
            this.height = height;
            this.weight = weight;
            this.sex = sex;
            this.name = name;
            this.color = color;
        }
        public Human( int height, int weight,  String name, String color) {
            this.age = age;
            this.height = height;
            this.weight = weight;
            this.sex = sex;
            this.name = name;
            this.color = color;
        }
        public Human( int height, int weight, boolean sex, String name, String color) {
            this.age = age;
            this.height = height;
            this.weight = weight;
            this.sex = sex;
            this.name = name;
            this.color = color;
        }
    }
}
