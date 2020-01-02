package com.xiaofeng.interpreter;

import java.util.HashSet;
import java.util.Set;

public class TerminalExpression implements Expression {//终止符表达式，实现具体解释逻辑
    private Set<String> set = new HashSet<String>();
    public TerminalExpression(String[] data){
        for(int i=0;i<data.length;i++){
            set.add(data[i]);
        }
    }

    @Override
    public boolean interpret(String info) {
        if(set.contains(info)){
            return true;
        }
        return false;
    }
}
