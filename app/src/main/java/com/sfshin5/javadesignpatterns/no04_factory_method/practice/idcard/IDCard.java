package com.sfshin5.javadesignpatterns.no04_factory_method.practice.idcard;

import com.sfshin5.javadesignpatterns.no04_factory_method.practice.framework.Product;

// 具体的製品の役
// Factory Methodパターンの「ConcreteProduct」に相当
public class IDCard extends Product {
    private String owner;
    private Integer cardNumber;
    private static int cardCounter = 1;

    IDCard(String owner) {
        System.out.println("Creating ID Card for " + owner + " (Card Number: " + cardCounter + ")");
        this.owner = owner;
        this.cardNumber = cardCounter++;
    }

    @Override
    public void use() {
        System.out.println("Using ID Card of " + owner + " (Card Number: " + cardNumber + ")");
    }

    public String getOwner() {
        return owner;
    }

    public Integer getCardNumber() {
        return cardNumber;
    }
    
}
