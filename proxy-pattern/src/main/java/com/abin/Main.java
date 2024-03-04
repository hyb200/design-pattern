package com.abin;

public class Main {
    public static void main(String[] args) {
        Printable p = new PrinterProxy("ikun");
        System.out.printf("现在的名字是： %s\n", p.getPrinterName());
        p.setPrinterName("hyb");
        System.out.printf("现在的名字是： %s\n", p.getPrinterName());
        p.print("hello, proxy-pattern");
    }
}