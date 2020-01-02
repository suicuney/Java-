package com.xiaofeng.mediator;

abstract class Mediator {//抽象中介者，具有登记和转发功能，依赖同事类
    public abstract void register(Colleague colleague);
    public abstract void relay(Colleague colleague);
}
