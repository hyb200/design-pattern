package com.abin;

/**
 * 真正的主体
 */
public class Printer implements Printable{
    private String name;

    public Printer() {
        heavyJob("正在生成 Printer 实例");
    }

    public Printer(String name) {
        this.name = name;
        heavyJob("正在生成 Printer 实例 (" + name + ")");
    }

    private void heavyJob(String msg) {
        System.out.print(msg);
        for (int i = 0; i < 3; i ++ ) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            System.out.print(".");
        }
        System.out.println();
    }

    @Override
    public void setPrinterName(String name) {
        this.name = name;
    }

    @Override
    public String getPrinterName() {
        return name;
    }

    @Override
    public void print(String msg) {
        System.out.println("=== " + name + " ===");
        System.out.println(msg);
    }
}
