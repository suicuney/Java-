package com.xiaofeng.memento;

public class Originator {//发起人，持有状态
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    public Memento createMemento(){//创建备忘录，关联关系
        return new Memento(state);
    }
    public void restoreMemento(Memento memento){//恢复备忘录，依赖关系
        this.setState(memento.getState());
    }
}
