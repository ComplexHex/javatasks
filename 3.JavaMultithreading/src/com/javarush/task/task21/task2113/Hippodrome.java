package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.List;

public class Hippodrome {
    private List<Horse> horses;
    static Hippodrome game;
    private double maxDistance = 0;
    private String nameMax;
    private Horse winner;

    public List<Horse> getHorses() {
        return horses;
    }

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    void run() throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            move();
            print();
            Thread.sleep(200);
        }
    }

    public void move() {
        for (int i = 0; i < horses.size(); i++) {
            Horse horse = horses.get(i);
            horse.move();
        }
    }

    public void print() {
        for (int i = 0; i < horses.size(); i++) {
            Horse horse = horses.get(i);
            horse.print();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
    }

    public Horse getWinner() {
        double horse1 = horses.get(0).distance;
        double horse2 = horses.get(1).distance;
        double horse3 = horses.get(2).distance;
        if (horse1 > horse2 && horse1 > horse3) {
            maxDistance = horse1;
            nameMax = horses.get(0).name;
            winner = horses.get(0);
        } else if (horse2 > horse1 && horse2 > horse3) {
            maxDistance = horse2;
            nameMax = horses.get(1).name;
            winner = horses.get(1);
        } else {
            maxDistance = horse3;
            nameMax = horses.get(2).name;
            winner = horses.get(2);

        }
        return winner;
    }

    public void printWinner() {
        Horse winner = getWinner();
        System.out.println("Winner is " + winner.getName() + "!");

    }


    public static void main(String[] args) throws InterruptedException {
        List<Horse> horses = new ArrayList<>();
        Horse horse1 = new Horse("Jack", 3.0, 0);
        Horse horse2 = new Horse("Funt", 3.0, 0);
        Horse horse3 = new Horse("Yasha", 3.0, 0);
        horses.add(horse1);
        horses.add(horse2);
        horses.add(horse3);
        game = new Hippodrome(horses);
        game.run();
        game.printWinner();


    }

}
