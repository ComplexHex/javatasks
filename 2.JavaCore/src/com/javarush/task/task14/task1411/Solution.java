package com.javarush.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
User, Loser, Coder and Proger
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;

        //тут цикл по чтению ключей, пункт 1

        while (true) {
            key = reader.readLine();
            if(key.equals("user")) {
                Person user = new Person.User();
                doWork(user);
            } else if(key.equals("loser")) {
                Person loser = new Person.Loser();
                doWork(loser);
            } else if (key.equals("coder")) {
                Person coder = new Person.Coder();
                doWork(coder);
            } else if (key.equals("proger")) {
                Person proger = new Person.Proger();
                doWork(proger);
            } else {
                break;
            }
        }

    }

    public static void doWork(Person person) {
        // пункт 3

        if (person instanceof Person.User) {
            ((Person.User) person).live();
        } else if (person instanceof Person.Loser) {
            ((Person.Loser) person).doNothing();
        } else if (person instanceof Person.Coder) {
            ((Person.Coder) person).writeCode();
        } else if (person instanceof Person.Proger) {
            ((Person.Proger) person).enjoy();
        }
    }
}
