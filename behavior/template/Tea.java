package com.swroom.behavior.template;

/**
 * 茶类
 * Created by jingz on 2017/1/16.
 */
public class Tea extends Beverage {
    @Override
    protected void brew() {
        System.out.println("泡上了一大杯绿茶！");
    }

    @Override
    protected void addCondiments() {

    }

    /**
     * 茶不需要加调料，所以重写此钩子函数
     * @return
     */
    @Override
    protected boolean needCondiemts() {
        return false;
    }
}
