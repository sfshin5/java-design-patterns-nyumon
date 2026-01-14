package com.sfshin5.javadesignpatterns.no08_abstract_factory;

public abstract class Item {
    protected String caption;
    
    public Item(String caption) {
        this.caption = caption;
    }
    
    public abstract String makeHTML();
    
}
