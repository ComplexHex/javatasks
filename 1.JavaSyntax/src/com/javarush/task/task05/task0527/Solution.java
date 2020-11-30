package com.javarush.task.task05.task0527;

/* 
Том и Джерри
*/

public class Solution {
    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);

        Dog dogDoggy = new Dog("white", 12, "long");
        Dog dogDoggy1 = new Dog("white1", 10, "short");

        Cat catTommy = new Cat("short", 32, 1);



    }

    public static class Mouse {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    //напишите тут ваш код

    public static class  Dog {
        String color;
        int weight;
        String ear;

        public Dog(String color, int weight, String ear) {
            this.color = color;
            this.weight = weight;
            this.ear = ear;

        }
    }

    public static class Cat {

        String wool;
        int teeth;
        int color;

        public Cat(String wool, int teeth, int color) {
            this.wool = wool;
            this.teeth = teeth;
            this.color = color;
        }
    }
}
