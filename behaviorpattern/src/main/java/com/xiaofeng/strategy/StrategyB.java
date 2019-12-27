package com.xiaofeng.strategy;

public class StrategyB implements Strategy {
    @Override
    public void strategyMethod() {
        System.out.println("具体策略B方法被访问！");
    }
}
