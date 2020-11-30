package com.javarush.task.task08.task0824;

import java.util.ArrayList;

/* 
Собираем семейство
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код

        Human child = new Human("zz",true,12, new ArrayList<>());
        Human child1 = new Human("zz1",true,2,new ArrayList<>());
        Human child2= new Human("zz2",true,1, new ArrayList<>());
        ArrayList<Human> children = new ArrayList<>();
        children.add(child);
        children.add(child1);
        children.add(child2);

        Human father = new Human("asdff", true, 45, children);
        Human mother = new Human("aa", false, 39, children);
        ArrayList<Human> fath = new ArrayList<>();
        fath.add(father);
        ArrayList<Human> moth = new ArrayList<>();
        moth.add(mother);

        Human grandFather = new Human("asdf", true, 62, fath);
        Human grandFather1 = new Human("asdf1", true, 62, moth);
        Human grandMother = new Human("ascv", false, 61, fath);
        Human grandMother1 = new Human("ascv", false, 61, moth);


        System.out.println(grandFather.toString());
        System.out.println(grandFather1.toString());
        System.out.println(grandMother.toString());;
        System.out.println(grandMother1.toString());
        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(children.toString());


    }

    public static class Human {
        public Human(String name, Boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public Human(String name, Boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        //напишите тут ваш код
        String name;
        Boolean sex;
        int age;
        ArrayList<Human> children;


        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
