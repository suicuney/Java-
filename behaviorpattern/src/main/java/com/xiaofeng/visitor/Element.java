package com.xiaofeng.visitor;

public interface Element {
    void accept(Visitor visitor);
}
