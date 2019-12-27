package com.xiaofeng.flyweight;

public class UnsharedConcreateFlyweight {//非享元角色，即不共享的元素集合
    private String info;

    public UnsharedConcreateFlyweight(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
