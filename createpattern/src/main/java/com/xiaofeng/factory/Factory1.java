package com.xiaofeng.factory;

public class Factory1 implements AbstractFactory{//具体工厂实现类
    public Product1 newProduct1(){
        System.out.println("工厂1创建等级1的产品1");
        return new Product11();
    }

    public Product2 newProduct2(){
        System.out.println("工厂1创建等级2的产品1");
        return new Product21();
    }
}
