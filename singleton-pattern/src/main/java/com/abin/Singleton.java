package com.abin;

public class Singleton {
    private static Singleton singleton = new Singleton();

    private Singleton() {
        System.out.println("生成 Singleton 实例");
    }

    public static Singleton getSingleton() {
        return singleton;
    }
}
