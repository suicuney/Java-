package com.xiaofeng.factory;

public class Factory2 implements AbstractFactory {//具体工厂实现类
    public Product newProduct(){
        System.out.println("工厂2创建产品2");
        return new Product2();
    }
}
