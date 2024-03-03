package com.abin;

/**
 * 非严谨的单例模式，会出现线程安全问题
 */
public class Singleton0 {
    private static Singleton0 singleton = null;

    private Singleton0() {
        System.out.println("生成 Singleton 实例");
    }

    public static Singleton0 getSingleton() {
        if (singleton == null)
            singleton = new Singleton0();
        return singleton;
    }
}
