package com.abin;

public class Main {
    public static void main(String[] args) {
        AbstractDisplay char_display = new CharDisplay('H');
        char_display.display();

        AbstractDisplay string_display = new StringDisplay("Hello World!");
        string_display.display();
    }
}