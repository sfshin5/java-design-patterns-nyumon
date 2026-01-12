package com.sfshin5.javadesignpatterns.no06_prototype;

import com.sfshin5.javadesignpatterns.no06_prototype.framework.Product;

// Prototypeパターンの「具体的なプロトタイプ」にあたるクラス
public class UnderlinePen implements Product {
    private char ulchar;
    
    public UnderlinePen(char ulchar) {
        this.ulchar = ulchar;
    }
    
    @Override
    public void use(String s) {
        int length = s.getBytes().length;
        System.out.println("\"" + s + "\"");
        for (int i = 0; i < length; i++) {
            System.out.print(ulchar);
        }
        System.out.println();
    }

    @Override
    public Product createClone() {
        Product p = null;
        try {
            p = (Product) this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
}