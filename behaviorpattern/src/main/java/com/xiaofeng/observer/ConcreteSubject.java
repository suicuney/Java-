package com.xiaofeng.observer;

public class ConcreteSubject extends Subject {//具体的观察方式实现，实现抽象观察观察方式，通知所有观察者
    @Override
    public void notifyObsever() {
        System.out.println("具体目标发生改变...");
        System.out.println("--------------");
        for(Object obj:obervers){
            ((Oberver)obj).respone();
        }
    }
}
