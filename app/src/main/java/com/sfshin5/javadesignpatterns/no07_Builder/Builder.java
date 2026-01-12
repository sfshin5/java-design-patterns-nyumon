package com.sfshin5.javadesignpatterns.no07_Builder;

// Builderの役
public abstract class Builder {
    public abstract void makeTitle(String title);
    public abstract void makeString(String str);
    public abstract void makeItems(String[] items);
    public abstract void close();
}
