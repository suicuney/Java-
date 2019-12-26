package com.xiaofeng.factory;

public class Factory1 implements AbstractFactory{//具体工厂实现类
    public Product newProduct(){
        System.out.println("工厂1创建产品1");
        return new Product1();
    }
}
