package com.xiaofeng.visitor;

public class ElementA implements Element {//具体元素A，持有自己的方法，调用通过访问者
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String operationA(){
        return "具体元素A的操作";
    }
}
