package com.sfshin5.javadesignpatterns.no08_abstract_factory.sample.factory;

public abstract class Link extends Item {
    protected String url;
    
    public Link(String caption, String url) {
        super(caption);
        this.url = url;
    }
}
