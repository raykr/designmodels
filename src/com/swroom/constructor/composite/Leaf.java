package com.swroom.constructor.composite;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * 叶子节点组件
 * Created by jingz on 2017/2/1.
 */
public class Leaf extends Component {
    // 叶子节点不具备添加的能力，所以不实现
    @Override
    protected void add(Component component) {
        throw new NotImplementedException();
    }

    // 叶子节点不具备添加的能力必然也不能删除
    @Override
    protected void remove(Component component) {
        throw new NotImplementedException();
    }

    // 叶子节点没有子节点所以显示自己的执行结果
    @Override
    protected void eachChild() {
        System.out.println("叶节点：" + this.getName() + "执行了");
    }
}
