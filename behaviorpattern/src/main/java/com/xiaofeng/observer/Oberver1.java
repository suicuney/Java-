package com.xiaofeng.observer;

public class Oberver1 implements Oberver {//观察者1
    @Override
    public void respone() {
        System.out.println("具体观察者1作出反应");
    }
}
