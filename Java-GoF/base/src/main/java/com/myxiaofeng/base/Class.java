package com.myxiaofeng.base;

public class Class {//班级
    private Student student;//学生组成班级，为组合关系，班级对象不在了，学生对象还在

    public Class(Student student) {
        this.student = student;
        System.out.println("班级创建！");
    }
}
