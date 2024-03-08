package com.abin;

public class Main {
    public static void main(String[] args) {
        Context context = new Context(new AddOperation());
        System.out.println("1 + 2 = " + context.executeOperation(1, 2));

        context = new Context(new SubtractOperation());
        System.out.println("1 - 2 = " + context.executeOperation(1, 2));

        context = new Context(new MultiplyOperation());
        System.out.println("1 * 2 = " + context.executeOperation(1, 2));
    }
}