package com.abin;

public class StringDisplay extends AbstractDisplay{
    private String string;

    public StringDisplay(String string) {
        this.string = string;
    }

    @Override
    public void open() {
        System.out.print("@@");
    }

    @Override
    public void print() {
        System.out.printf("The string is '%s'", string);
    }

    @Override
    public void close() {
        System.out.println("@@");
    }
}
