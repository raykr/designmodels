package com.swroom.behavior.visitor;

import java.util.List;

/**
 * 调用类
 * Created by jingz on 2017/1/24.
 */
public class Client {

    public static void main(String[] args) {
        List<Element> list = ObjectStructure.getList();
        for (Element e :
                list) {
            e.accept(new Visitor());
        }
    }
}
