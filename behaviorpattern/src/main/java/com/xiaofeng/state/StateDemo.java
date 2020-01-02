package com.xiaofeng.state;

public class StateDemo {
    public static void main(String[] args) {//状态模式
        Context context = new Context();//环境类持有状态信息
        context.handle();//根据调用，运行时改变具体状态，初始为1，改为2
        context.handle();//再次调用，显示2，更改为1。
    }
}
