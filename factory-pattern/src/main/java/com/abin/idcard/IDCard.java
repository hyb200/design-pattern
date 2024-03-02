package com.abin.idcard;

import com.abin.framework.Product;

public class IDCard extends Product {

    private String owner;

    public IDCard(String owner) {
        System.out.printf("制作 %5s 的IDCard\n", owner);
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }

    @Override
    public void use() {
        System.out.printf("使用 %5s 的IDCard\n", owner);
    }
}
