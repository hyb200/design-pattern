package com.abin;

/**
 * 建造者
 * <p>
 * 负责定义生成实例的方法
 */
public abstract class Builder {
    public abstract void makeTitle(String title);

    public abstract void makeContent(String content);

    public abstract void close();
}
