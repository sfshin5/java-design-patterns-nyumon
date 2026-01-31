package com.sfshin5.javadesignpatterns.no08_abstract_factory.sample.listfactory;
import com.sfshin5.javadesignpatterns.no08_abstract_factory.sample.factory.*;

public class ListLink extends Link {
    public ListLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String makeHTML() {
        return "<li><a href=\"" + url + "\">" + caption + "</a></li>";
    }
}