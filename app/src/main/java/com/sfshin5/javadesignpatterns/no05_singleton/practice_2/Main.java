package com.sfshin5.javadesignpatterns.no05_singleton.practice_2;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start.");
        Triple objZero1 = Triple.getInstance(0);
        Triple objOne1 = Triple.getInstance(1);
        Triple objTwo1 = Triple.getInstance(2);
        Triple objZero2 = Triple.getInstance(0);
        Triple objOne2 = Triple.getInstance(1);
        Triple objTwo2 = Triple.getInstance(2);
        if (objZero1 == objZero2) {
            System.out.println("同一のインスタンスです。");
        } else {
            System.out.println("別々のインスタンスです。");
        }
        if (objOne1 == objOne2) {
            System.out.println("同一のインスタンスです。");
        } else {
            System.out.println("別々のインスタンスです。");
        }
        if (objTwo1 == objTwo2) {
            System.out.println("同一のインスタンスです。");
        } else {
            System.out.println("別々のインスタンスです。");
        }
        System.out.println("End.");
    }
}
