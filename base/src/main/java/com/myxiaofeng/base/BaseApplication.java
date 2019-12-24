package com.myxiaofeng.base;

public class BaseApplication {

	public static void main(String[] args) {
		UseDemo useDemo = new UseDemo();
		Student student = new Student("小王",18);
		useDemo.sayHelloDemo(student);//继承的多态
		useDemo.interfaceDemo(student);//接口的多态

		System.out.println("==================");
		Teacher teacher = new Teacher("老师",35);
		useDemo.sayHelloDemo(teacher);//继承的多态
		useDemo.interfaceDemo(teacher);//接口的多态

		System.out.println("==================");
		student.setClock(student.getWatch());//依赖关系 方法参数依赖手表对象
		//组合例子
		Class myclass = new Class(student);//学生组成班级，为组合关系，班级对象不在了，学生对象还在
	}

}
