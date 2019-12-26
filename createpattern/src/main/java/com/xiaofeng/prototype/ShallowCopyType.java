package com.xiaofeng.prototype;

public class ShallowCopyType implements Cloneable {//浅拷贝的具体类，实现cloneable接口，该接口为标记接口，实现由Object实现

    public ShallowCopyType() {
        System.out.println("具体类创建成功！");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("具体类复制成功！");
        return super.clone();
    }

}
