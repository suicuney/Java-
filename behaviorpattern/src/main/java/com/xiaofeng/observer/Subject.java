package com.xiaofeng.observer;

import java.util.ArrayList;
import java.util.List;

abstract class Subject {//抽象的观察者集合，持有多个观察者，并且抽象通知方式
    protected List<Oberver> obervers = new ArrayList<Oberver>();

    public void add(Oberver oberver){
        obervers.add(oberver);
    }

    public void remove(Oberver oberver){
        obervers.remove(oberver);
    }

    public abstract void notifyObsever();
}
