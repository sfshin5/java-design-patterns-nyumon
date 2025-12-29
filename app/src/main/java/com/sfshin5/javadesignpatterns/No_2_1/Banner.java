package com.sfshin5.javadesignpatterns.No_2_1;

// 適用される側の役
// すでに用意されているメソッドを持っている役
public class Banner {
    private String string;

    public Banner(String string) {
        this.string = string;
    }

    public void showWithParen() {
        System.out.println("(" + string + ")");
    }

    public void showWithAster() {
        System.out.println("*" + string + "*");
    }
}

