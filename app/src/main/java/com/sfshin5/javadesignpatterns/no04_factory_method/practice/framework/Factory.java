package com.sfshin5.javadesignpatterns.no04_factory_method.practice.framework;

// 作成者の役
// Factory Methodパターンの「Creator」に相当
// newによる実際のインスタンス生成を、インスタンス生成のためのメソッド呼び出しに代えることで、
// 具体的なクラス名による束縛からスーパークラスを解放する。

// frameworkパッケージはidcardパッケージに依存していない。
public abstract class Factory {
    public final Product create(String owner){
        Product p = createProduct(owner);
        registerProduct(p);
        return p;
    }
    protected abstract Product createProduct(String owner);
    protected abstract void registerProduct(Product product);
}
