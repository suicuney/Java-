package com.xiaofeng.decorator;

public class Component1 implements Component {
    public Component1() {
        System.out.println("具体组件类创建");
    }

    @Override
    public void operation() {
        System.out.println("调用具体要装饰组件类的方法！");
    }
}
