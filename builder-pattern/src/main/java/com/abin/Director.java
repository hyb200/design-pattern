package com.abin;

/**
 * 指挥者
 * <p>
 * 负责调用 Builder 的接口来生成实例
 */
public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void build() {
        //  依次构建每一部分
        builder.makeTitle("This is builder-pattern");
        builder.makeContent("I'm learning design pattern.");
        builder.close();
    }
}
