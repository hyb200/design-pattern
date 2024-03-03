package com.abin;

public class Main {
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getSingleton();
        System.out.println(obj1);

        Singleton obj2 = Singleton.getSingleton();
        System.out.println(obj2);

        if (obj1.equals(obj2)) {
            System.out.println("obj1 和 obj2 是同一实例");
        }
    }
}