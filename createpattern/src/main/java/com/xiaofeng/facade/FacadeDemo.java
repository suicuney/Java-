package com.xiaofeng.facade;

public class FacadeDemo {
    public static void main(String[] args) {
        Facade facade = new Facade();//外观模式就是Spring里面的Service层体现
        facade.method();
    }
}
