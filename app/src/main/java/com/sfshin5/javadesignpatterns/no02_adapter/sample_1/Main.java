package com.sfshin5.javadesignpatterns.no02_adapter.sample_1;

// 依頼者の役
// Target役を使って仕事をする
public class Main {
    public static void main(String[] args) {
        Print p = new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();
    }
    
}
