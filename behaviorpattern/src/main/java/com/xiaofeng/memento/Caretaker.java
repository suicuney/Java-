package com.xiaofeng.memento;

public class Caretaker {//管理者，持有备忘录
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
