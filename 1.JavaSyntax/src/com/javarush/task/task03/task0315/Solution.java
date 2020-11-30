package com.javarush.task.task03.task0315;

/* 
Каждый охотник желает знать…
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Red r = new Red();
        r.toString();
        Orange o = new Orange();
        o.toString();
        Yellow y = new Yellow();
        y.toString();
        Green g = new Green();
        g.toString();
        Blue blue = new Blue();
        blue.toString();
        Indigo indigo = new Indigo();
        indigo.toString();
        Violet violet = new Violet();
        violet.toString();
    }

    public static class Red {
        public Red() {
            System.out.println("Red");
        }
    }

    public static class Orange {
        public Orange() {
            System.out.println("Orange");
        }
    }

    public static class Yellow {
        public Yellow() {
            System.out.println("Yellow");
        }
    }

    public static class Green {
        public Green() {
            System.out.println("Green");
        }
    }

    public static class Blue {
        public Blue() {
            System.out.println("Blue");
        }
    }

    public static class Indigo {
        public Indigo() {
            System.out.println("Indigo");
        }
    }

    public static class Violet {
        public Violet() {
            System.out.println("Violet");
        }
    }
}
