package com.xiaofeng.flyweight;

public class Flywight1 implements Flyweight {//具体享元角色
    private String key;

    public Flywight1(String key) {
        this.key = key;
        System.out.println("具体享元角色" + key + "被创建！");
    }

    @Override
    public void operation(UnsharedConcreateFlyweight state) {
        System.out.print("具体享元" + key + "被调用，");
        System.out.println("非享元信息是:" + state.getInfo());
    }
}
