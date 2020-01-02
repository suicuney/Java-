package com.xiaofeng.mediator;

public class MediatorDemo {
    public static void main(String[] args) {//中介者模式
        Mediator mediator = new Mediator1();//创建具体中介者
        Colleague1 colleague1 = new Colleague1();//创建具体同事类1
        Colleague2 colleague2 = new Colleague2();//创建具体同事类2
        mediator.register(colleague1);//中介者持有添加
        mediator.register(colleague2);//中介者持有添加
        colleague1.send();//同事1通过中介者发送信息到同事2，类似qq群
        System.out.println("-------------");
        colleague2.send();
    }
}
