package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        Human son = new Human("asdf11", true, 12);
        Human son1 = new Human("asd11f", true, 12);
        Human son2 = new Human("asd111f", true, 12);
        Human son3 = new Human("a123sdf", true, 12);
        Human son4 = new Human("asdf1", true, 12, new Human(), new Human());
        Human son5 = new Human("asdf2", true, 12, new Human(), new Human());
        Human son6 = new Human("asdf3", true, 12, new Human(), new Human());
        Human son7 = new Human("asdf4", true, 12, new Human(), new Human());
        Human son8 = new Human("asdf5", true, 12, new Human(), new Human());

        System.out.println(son.toString());
        System.out.println(son1.toString());
        System.out.println(son2.toString());
        System.out.println(son3.toString());
        System.out.println(son4.toString());
        System.out.println(son5.toString());
        System.out.println(son6.toString());
        System.out.println(son7.toString());
        System.out.println(son8.toString());
    }


    public static class Human {
        // напишите тут ваш код
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human() {
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }
        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;

        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}