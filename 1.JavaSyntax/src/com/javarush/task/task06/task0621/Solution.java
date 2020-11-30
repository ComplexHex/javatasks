package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Cat catGrandFather = new Cat(reader.readLine());

        Cat catGrandMother = new Cat(reader.readLine());

        Cat catFather = new Cat(reader.readLine(), null, catGrandFather);

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName, catGrandMother, null);

        Cat catSon = new Cat(reader.readLine(), catMother, catFather);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catMother, catFather);


        System.out.println(catGrandFather);
        System.out.println(catGrandMother);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);
    }

    public static class Cat {
        private String name;

        private Cat catMother;
        private Cat catFather;

        public Cat(String name) {
            this.name = name;
        }

        public Cat(String name, Cat catMother, Cat catFather) {
            this.name = name;
            this.catMother = catMother;
            this.catFather = catFather;

        }

        @Override
        public String toString() {
            if (catMother == null && catFather == null)
                return "The cat's name is " + name + ", no mother, " + "no father";
            else if (catMother == null && catFather != null)
                return "The cat's name is " + name + ", no mother, " + "father is " + catFather.name;
            else if (catMother != null && catFather != null)
                return "The cat's name is " + name + ", mother is " + catMother.name +  ", father is " + catFather.name;
            else /* if (mother != null && father == null) */
                return "The cat's name is " + name + ", mother is " + catMother.name + ", no father";


        }

    }
}
