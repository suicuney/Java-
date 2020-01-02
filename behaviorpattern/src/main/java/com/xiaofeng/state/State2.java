package com.xiaofeng.state;

public class State2 extends State {
    @Override
    public void handle(Context context) {//状态实现类，动态的改变环境类中的状态
        System.out.println("当前状态是2");
        context.setState(new State1());
    }
}
