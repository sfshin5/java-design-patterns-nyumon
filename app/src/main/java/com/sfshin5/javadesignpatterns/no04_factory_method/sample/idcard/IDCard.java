package com.sfshin5.javadesignpatterns.no04_factory_method.sample.idcard;

import com.sfshin5.javadesignpatterns.no04_factory_method.sample.framework.Product;

// 具体的製品の役
// Factory Methodパターンの「ConcreteProduct」に相当
public class IDCard extends Product {
    private String owner;

    IDCard(String owner) {
        System.out.println("Creating ID Card for " + owner);
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println("Using ID Card of " + owner);
    }

    public String getOwner() {
        return owner;
    }
    
}
