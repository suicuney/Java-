package com.xiaofeng.strategy;

public class StrategyA implements Strategy {
    @Override
    public void strategyMethod() {
        System.out.println("具体策略A方法被访问！");
    }
}
