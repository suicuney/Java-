package com.xiaofeng.observer;

public class OberverDemo {
    public static void main(String[] args) {//观察者模式
        Subject subject = new ConcreteSubject();//创建具体的观察者实现方式
        Oberver oberver1 = new Oberver1();//观察者1
        Oberver oberver2 = new Oberber2();//观察者2
        subject.add(oberver1);//加入待观察的观察者
        subject.add(oberver2);//加入待观察的观察者
        subject.notifyObsever();//根据具体实现，通知观察者
    }
}
