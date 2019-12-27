package com.xiaofeng.adapter;

public class Adaptee {//具体要适配的对象
    public void specificRequest(){
        System.out.println("适配者的方法被调用");
    }
}
