package com.sfshin5.javadesignpatterns.No_4_1.idcard;

import com.sfshin5.javadesignpatterns.No_4_1.framework.Product;

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
