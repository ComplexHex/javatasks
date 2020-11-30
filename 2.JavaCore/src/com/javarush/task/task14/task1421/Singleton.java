package com.javarush.task.task14.task1421;

public class Singleton {

    private final static Singleton instance = null;

    public static final Singleton getInstance() {
        return instance;
    }

    private Singleton() {
    }
}
