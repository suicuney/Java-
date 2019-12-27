package com.xiaofeng.composite;

public interface Component {//叶子接口，面向接口编程
    public void add(Component component);
    public void remove(Component component);
    public Component getChild(int i);
    public void operation();

}
