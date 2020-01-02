package com.xiaofeng.interpreter;

public class Context {//环境类，持有抽象表达式接口，并创建具体解释器
    private String[] citys = {"韶关","广州"};
    private String[] persons = {"老人","妇女","儿童"};
    private Expression andExpression;

    public Context() {
        Expression city = new TerminalExpression(citys);
        Expression person = new TerminalExpression(persons);
        andExpression = new AndExpression(city,person);
    }

    public void freeRide(String info){//调用解释器
        boolean ok = andExpression.interpret(info);
        if(ok){
            System.out.println("您是"+info+"，您本次乘车免费！");
        }else{
            System.out.println(info+"，您不是免费人员，本次乘车扣费");
        }
    }
}
