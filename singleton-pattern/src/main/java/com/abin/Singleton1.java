package com.abin;

/**
 * 严谨的单例模式
 */
public class Singleton1 {
    private static Singleton1 singleton = null;

    private Singleton1() {
        System.out.println("生成 Singleton 实例");
    }

    public static synchronized Singleton1 getSingleton() {
        if (singleton == null) singleton = new Singleton1();
        return singleton;
    }
}
