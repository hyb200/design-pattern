package com.abin;

import com.abin.idcard.IDCardFactory;
import com.abin.framework.Factory;
import com.abin.framework.Product;

public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product p1 = factory.create("hyb");
        p1.use();

        Product p2 = factory.create("ikun");
        p2.use();
    }
}