package com.swroom.constructor.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 除叶子节点外的其他组合组件
 * Created by jingz on 2017/2/1.
 */
public class Composite extends Component {

    // 用来保存组合的部件
    List<Component> myList = new ArrayList<>();

    @Override
    protected void add(Component component) {
        myList.add(component);
    }

    @Override
    protected void remove(Component component) {
        myList.remove(component);
    }

    @Override
    protected void eachChild() {
        System.out.println("非叶节点：" + this.getName() + "执行了");
        for (Component c: myList) {
            c.eachChild();
        }
    }
}
