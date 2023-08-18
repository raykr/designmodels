package com.swroom.creator.factory;

/**
 * 用于生产汽车的工厂
 * Created by jingz on 2017/1/12.
 */
public interface IFactory {

    /**
     * 工厂方法，生产汽车
     * @return
     */
    ICar createCar();
}
