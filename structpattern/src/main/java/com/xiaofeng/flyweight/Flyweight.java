package com.xiaofeng.flyweight;

public interface Flyweight {//享元（轻量级的含义），共享对象的意思
    public void operation(UnsharedConcreateFlyweight state);//享元共享方法，并传入持有非享元的信息
}
