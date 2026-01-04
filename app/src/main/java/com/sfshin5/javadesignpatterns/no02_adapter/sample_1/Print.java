package com.sfshin5.javadesignpatterns.no02_adapter.sample_1;

// 対象の役
// 今必要となっているメソッドを定めている役
public interface Print {
    public abstract void printWeak();
    public abstract void printStrong();
}
