package com.sfshin5.javadesignpatterns.no02_adapter.sample_2;

public class Main {
    public static void main(String[] args) {
        Print p = new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();
    }
    
}
