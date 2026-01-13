package com.sfshin5.javadesignpatterns.no07_Builder.practice_1;

// Builderの役
public interface Builder {
    public abstract void makeTitle(String title);
    public abstract void makeString(String str);
    public abstract void makeItems(String[] items);
    public abstract void close();
}
