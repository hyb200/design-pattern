package com.abin;

/**
 * 代理类，处理client的请求，当自己处理不了时，才会交给本人处理
 */
public class PrinterProxy implements Printable {
    /**
     * 名字
     */
    private String name;

    /**
     * 本人
     */
    private Printer real;

    public PrinterProxy(String name) {
        this.name = name;
    }

    @Override
    public void setPrinterName(String name) {
        if (real != null) real.setPrinterName(name);
        this.name = name;
    }

    @Override
    public String getPrinterName() {
        return name;
    }

    @Override
    public void print(String msg) {
        //  使用静态代理
        if (real == null) real = new Printer(name);
        real.print(msg);
    }
}
