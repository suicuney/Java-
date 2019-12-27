package com.xiaofeng.composite;

import java.util.ArrayList;

public class Composite implements Component {//节点本身也是叶子，同时还有其他叶子
    private ArrayList<Component> childens = new ArrayList<Component>();

    @Override
    public void add(Component component) {
        childens.add(component);
    }

    @Override
    public void remove(Component component) {
        childens.remove(component);
    }

    @Override
    public Component getChild(int i) {
        return childens.get(i);
    }

    @Override
    public void operation() {
        for(Object obj : childens){
            ((Component) obj).operation();
        }
    }
}
