package com.javarush.task.task03.task0307;

/* 
Привет StarCraft!
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Zerg z1 = new Zerg();
        z1.name = "1";
        Zerg z2 = new Zerg();
        z2.name = "2";
        Zerg z3 = new Zerg();
        z3.name = "3";
        Zerg z4 = new Zerg();
        z4.name = "4";
        Zerg z5 = new Zerg();
        z5.name = "5";
        Protoss pr1 = new Protoss();
        pr1.name = "12";
        Protoss pr2 = new Protoss();
        pr2.name = "122";
        Protoss pr3 = new Protoss();
        pr3.name = "123";
        Terran ter1 = new Terran();
        ter1.name = "23";
        Terran ter2 = new Terran();
        ter2.name = "231";
        Terran ter3 = new Terran();
        ter3.name = "235";
        Terran ter4 = new Terran();
        ter4.name = "235k";
    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
