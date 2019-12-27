package com.xiaofeng.bridge;

public class ImplementorA implements Implementor {//具体的实现方法
    @Override
    public void operationImpl() {
        System.out.println("具体实现化方法被访问！");
    }
}
