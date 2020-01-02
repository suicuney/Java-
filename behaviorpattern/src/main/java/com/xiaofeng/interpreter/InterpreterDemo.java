package com.xiaofeng.interpreter;

public class InterpreterDemo {//解释器模式 用的较少
    public static void main(String[] args) {
        Context context = new Context();//构建环境类，初始化解释器
        context.freeRide("韶关的老人");//进行解释字符串
        context.freeRide("韶关的年轻人");
        context.freeRide("广州的妇女");
        context.freeRide("广州的儿童");
        context.freeRide("山东的儿童");
    }
}
