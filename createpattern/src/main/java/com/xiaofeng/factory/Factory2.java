package com.xiaofeng.factory;

public class Factory2 implements AbstractFactory {//具体工厂实现类
    public Product1 newProduct1(){
        System.out.println("工厂2创建等级1的产品2");
        return new Product12();
    }

    public Product2 newProduct2(){
        System.out.println("工厂2创建等级2的产品2");
        return new Product22();
    }
}
