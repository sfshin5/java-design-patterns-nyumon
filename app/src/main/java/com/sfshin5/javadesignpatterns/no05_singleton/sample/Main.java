package com.sfshin5.javadesignpatterns.no05_singleton.sample;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start.");
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        if (obj1 == obj2) {
            System.out.println("同一のインスタンスです。");
        } else {
            System.out.println("別々のインスタンスです。");
        }
        System.out.println("End.");
    }
}
