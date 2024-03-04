package com.abin;

/**
 * 代理模式中的主体
 */
public interface Printable {
    void setPrinterName(String name);

    String getPrinterName();

    void print(String msg);
}
