package com.abin.framework;

public abstract class Factory {
    //  使用模板方法模式
    public abstract Product createProduct(String owner);

    public abstract void registerProduct(Product product);

    public final Product create(String owner) {
        Product product = createProduct(owner);
        registerProduct(product);
        return product;
    }
}
