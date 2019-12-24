package com.myxiaofeng.base;

public class BaseApplication {

	public static void main(String[] args) {
		//学生类继承自人类
		Student student = new Student();

		student.buy();//关联关系+依赖关系 创建手表对象（依赖） 持有手表对象（关联）
		student.setClock(student.getWatch());//依赖关系 方法参数依赖手表对象
		student.getTime();//依赖关系 调用手表静态方法

		Class myclass = new Class(student);//学生组成班级，为组合关系，班级对象不在了，学生对象还在

	}

}
