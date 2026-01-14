package com.sfshin5.javadesignpatterns.no08_abstract_factory.sample.factory;

import java.util.ArrayList;

import com.sfshin5.javadesignpatterns.no08_abstract_factory.Item;

public abstract class Tray extends Item {
    protected ArrayList tray = new ArrayList();
    protected Item[] trayItems;
    
    public Tray(String caption) {
        super(caption);
    }
    
    public void add(Item item) {
        tray.add(item);
    }
    
}
