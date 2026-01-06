package com.sfshin5.javadesignpatterns.no05_singleton.practice_2;

public class Triple {
    private static Triple zero = new Triple(0);
    private static Triple one = new Triple(1);
    private static Triple two = new Triple(2);

    private Triple(int id) {
        System.out.println("インスタンスを生成しました。");
    }
    
    public static Triple getInstance(int id) {
        if (id == 0){
            return zero;
        } else if (id == 1){
            return one;
        } else if (id == 2){
            return two;
        }
        return null;
    }
}
