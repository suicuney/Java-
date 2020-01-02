package com.xiaofeng.memento;

public class MementoDemo {//备忘录模式
    public static void main(String[] args) {
        Originator or = new Originator(); //发起人设置状态
        or.setState("S0");
        System.out.println("初始状态:"+or.getState());
        Caretaker cr = new Caretaker();
        cr.setMemento(or.createMemento());//保存进备忘录
        or.setState("S1");
        System.out.println("新状态："+or.getState());
        or.restoreMemento(cr.getMemento());//恢复备忘录
        System.out.println("恢复状态："+or.getState());
    }
}
