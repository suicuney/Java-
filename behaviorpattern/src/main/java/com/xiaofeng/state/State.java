package com.xiaofeng.state;

public abstract class State {
    public abstract void handle(Context context);//依赖环境类，实现类中动态的改变环境类的状态

}
