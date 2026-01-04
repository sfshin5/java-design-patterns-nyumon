package com.sfshin5.javadesignpatterns.no04_factory_method.practice;

import com.sfshin5.javadesignpatterns.no04_factory_method.practice.framework.*;
import com.sfshin5.javadesignpatterns.no04_factory_method.practice.idcard.*;

public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("Alice");
        Product card2 = factory.create("Bob");
        Product card3 = factory.create("Charlie");
        card1.use();
        card2.use();
        card3.use();
    }
    
}
