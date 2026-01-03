package com.sfshin5.javadesignpatterns.No_4_1.idcard;

import com.sfshin5.javadesignpatterns.No_4_1.framework.*;
import java.util.ArrayList;
import java.util.List;

// 具体的作成者の役
// Factory Methodパターンの「ConcreteCreator」に相当
public class IDCardFactory extends Factory{
    private List<String> owners = new ArrayList<>();
    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }
    @Override
    protected void registerProduct(Product product) {
        owners.add(((IDCard) product).getOwner());
    }
    public List<String> getOwners(){
        return owners;
    }
    
}
