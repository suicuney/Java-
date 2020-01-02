package com.xiaofeng.interpreter;

public interface Expression {//抽象表达式，定义解释器接口，
    public boolean interpret(String info);
}
