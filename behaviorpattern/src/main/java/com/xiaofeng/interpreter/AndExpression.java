package com.xiaofeng.interpreter;

public class AndExpression implements Expression {//非终结符表达式，组合方式持有表达式，本例是持有并调用终结符解释方法
    private Expression city = null;
    private Expression person = null;

    public AndExpression(Expression city, Expression person) {
        this.city = city;
        this.person = person;
    }

    @Override
    public boolean interpret(String info) {//调用终结符表达式的方法，有递归思想
        String s[] = info.split("的");
        return city.interpret(s[0])&&person.interpret(s[1]);
    }
}
