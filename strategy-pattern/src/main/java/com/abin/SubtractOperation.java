package com.abin;

public class SubtractOperation implements Strategy{
    @Override
    public int doOperation(int a, int b) {
        return a - b;
    }
}
