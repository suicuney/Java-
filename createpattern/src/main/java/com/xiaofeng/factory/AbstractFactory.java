package com.xiaofeng.factory;

public interface AbstractFactory {//抽象工厂接口,使得客户端依赖此接口不依赖于具体的实现类
    public Product1 newProduct1();
    public Product2 newProduct2();

}
