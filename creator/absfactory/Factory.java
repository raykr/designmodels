package com.swroom.creator.absfactory;

/**
 * 抽象工厂，一对多关系
 * Created by jingz on 2017/1/13.
 */
public class Factory implements IFactory {

    @Override
    public IHatchbackCar createHatchbackCar() {
        return new HatchbackCar();
    }

    @Override
    public IThreeBoxCar createThreeBoxCar() {
        return new ThreeBoxCar();
    }
}
