package com.swroom.constructor.composite;

/**
 * 客户端
 * Created by jingz on 2017/2/1.
 */
public class Client {
    public static void main(String[] args) {

        // 构造根节点
        Composite root = new Composite();
        root.setName("根节点");

        // 构造叶子节点
        Leaf l01 = new Leaf();
        l01.setName("叶子节点01");
        Leaf l02 = new Leaf();
        l02.setName("叶子节点02");

        // 组合部件
        root.add(l01);
        root.add(l02);

        // 遍历组合部件
        root.eachChild();

    }
}
