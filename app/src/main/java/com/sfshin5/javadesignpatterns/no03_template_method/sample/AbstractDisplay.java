package com.sfshin5.javadesignpatterns.no03_template_method.sample;

// 抽象クラスの役
public abstract class AbstractDisplay {
    public abstract void open();
    public abstract void print();
    public abstract void close();

    public final void display() {
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        close();
    }
}