package com.xiaofeng.strategy;

public class StrategyDemo {
    public static void main(String[] args) {//策略模式
        Context context = new Context();//用于组织各种策略的环境类
        Strategy strategyA = new StrategyA();
        context.setStrategy(strategyA);
        context.strategyMethod();//调用组织好的策略方法
        System.out.println("============");
        Strategy strategyB = new StrategyB();
        context.setStrategy(strategyB);
        context.strategyMethod();
    }
}
