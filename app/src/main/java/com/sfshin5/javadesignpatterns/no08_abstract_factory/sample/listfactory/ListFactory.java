package com.sfshin5.javadesignpatterns.no08_abstract_factory.sample.listfactory;

import com.sfshin5.javadesignpatterns.no08_abstract_factory.sample.factory.*;

public class ListFactory extends Factory{
    public Link createLink(String caption, String url) {
        return new ListLink(caption, url);
    }
    public Tray createTray(String caption) {
        return new ListTray(caption);
    }
    public Page createPage(String title, String author) {
        return new ListPage(title, author);
    }
}