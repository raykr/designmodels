package com.swroom.constructor.composite;

/**
 * 抽象的部件类描述将来所有部件共有的行为
 * Created by jingz on 2017/2/1.
 */
public abstract class Component {

    private String name; // 组件名

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * 增加子组件
     * @param component
     */
    protected abstract void add(Component component);

    /**
     * 移除子组件
     * @param component
     */
    protected abstract void remove(Component component);

    /**
     * 遍历所有子节点组件
     */
    protected abstract void eachChild();
}
