package com.xiaofeng.mediator;

abstract class Colleague {//抽象同事类，关联中介者，有抽象的发送和接收方法
    protected Mediator mediator;
    public void setMediator(Mediator mediator){
        this.mediator = mediator;
    }

    public abstract void receive();
    public abstract void send();
}
