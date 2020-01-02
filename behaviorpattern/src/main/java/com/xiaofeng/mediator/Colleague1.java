package com.xiaofeng.mediator;

public class Colleague1 extends Colleague {//具体的同事类，实现发送和接收方法
    @Override
    public void receive() {
        System.out.println("具体同事1接到请求");
    }

    @Override
    public void send() {
        System.out.println("具体同事1发出请求");
        mediator.relay(this);
    }
}
