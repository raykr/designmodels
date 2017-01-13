package com.swroom.creator.absfactory;

/**
 * 一个工厂可生产多种类型汽车
 * Created by jingz on 2017/1/13.
 */
public interface IFactory {

    /**
     * 生产两厢车
     * @return
     */
    IHatchbackCar createHatchbackCar();

    /**
     * 生产三厢车
     * @return
     */
    IThreeBoxCar createThreeBoxCar();
}
