package com.sfshin5.javadesignpatterns.no08_abstract_factory.sample.factory;

public abstract class Factory {

    public static Factory getFactory(String classname) {
    Factory factory = null;
    try {
        factory = (Factory)Class.forName(classname).newInstance();
    } catch (ClassNotFoundException e) {
        e.printStackTrace();
    } catch (Exception e) {
        e.printStackTrace();
    }
    return factory;
}
}
