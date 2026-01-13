package com.sfshin5.javadesignpatterns.no07_Builder.practice_1;

// Directorの役
// DirectorクラスはBuilderクラスのメソッドを使う
// 自分が実際に呼び出している具体的なクラスは知らない（メインクラスは知っているがサブクラスは知らない）
// 知らないからこそ入れ替えが可能になる
public class Director {
    private Builder builder;
    
    public Director(Builder builder) {
        this.builder = builder;
    }
    
    public void construct() {
        builder.makeTitle("Greeting");
        builder.makeString("朝から昼にかけて");
        builder.makeItems(new String[]{
            "おはようございます。",
            "こんにちは。"
        });
        builder.makeString("夜に");
        builder.makeItems(new String[]{
            "こんばんは。",
            "おやすみなさい。",
            "さようなら。"
        });
        builder.close();
    }

}
