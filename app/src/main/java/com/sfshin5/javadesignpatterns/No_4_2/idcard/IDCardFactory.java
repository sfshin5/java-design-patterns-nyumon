package com.sfshin5.javadesignpatterns.No_4_2.idcard;

import com.sfshin5.javadesignpatterns.No_4_2.framework.*;
import java.util.HashMap;
import java.util.Map;

// 具体的作成者の役
// Factory Methodパターンの「ConcreteCreator」に相当
public class IDCardFactory extends Factory{
    private HashMap<Integer, String> idcardMap = new HashMap<>();
    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }
    @Override
    protected void registerProduct(Product product) {
        idcardMap.put(((IDCard) product).getCardNumber(), ((IDCard) product).getOwner());
    }
    public Map<Integer, String> getOwners(){
        return idcardMap;
    }
    
}
