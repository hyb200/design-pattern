package com.abin;

/**
 * 抽象类，定义某个流程的模板
 */
public abstract class AbstractDisplay {
    public abstract void open();

    public abstract void print();

    public abstract void close();

    public final void display() {
        open();
        print();
        close();
    }
}
