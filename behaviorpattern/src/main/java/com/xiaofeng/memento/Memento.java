package com.xiaofeng.memento;

public class Memento {//备忘录，持有状态，有获得和设置状态方法
    private String state;
    public Memento(String state){
        this.state = state;
    }
    public void setState(String state){
        this.state = state;
    }
    public String getState(){
        return state;
    }
}
