package com.abin;

public class AddOperation implements Strategy{
    @Override
    public int doOperation(int a, int b) {
        return a + b;
    }
}
