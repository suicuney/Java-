package com.xiaofeng.builder;

public abstract class Builder {//抽象建造者，依据抽象开发
    protected Product product = new Product();
    public abstract void buildPartA();
    public abstract void buildPartB();
    public abstract void buildPartC();

    public Product getResult(){
        return product;
    }
}
