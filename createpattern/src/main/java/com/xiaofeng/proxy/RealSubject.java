package com.xiaofeng.proxy;

public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("访问真正的题主");
    }
}
