package com.xiaofeng.builder;

public class Builder1 extends Builder {//具体建造者，实现具体建造方法
    @Override
    public void buildPartA() {
        product.setPartA("组装部件A！");
    }

    @Override
    public void buildPartB() {
        product.setPartB("组装部件B!");
    }

    @Override
    public void buildPartC() {
        product.setPartC("组装部件C!");
    }
}
