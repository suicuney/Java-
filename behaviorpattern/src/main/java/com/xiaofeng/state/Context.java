package com.xiaofeng.state;

public class Context {//环境类，组合持有状态类
    private State state;

    public Context() {
        this.state = new State1();
    }

    public void setState(State state){
        this.state = state;
    }

    public State getState(){
        return this.state;
    }

    public void handle(){
        state.handle(this);
    }

}
