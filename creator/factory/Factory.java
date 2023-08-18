package com.swroom.creator.factory;

import com.swroom.creator.factory.model.Engine;
import com.swroom.creator.factory.model.Underpan;
import com.swroom.creator.factory.model.Wheel;

/**
 * 工厂实现，在此编写逻辑
 * Created by jingz on 2017/1/12.
 */
public class Factory implements IFactory {

    /**
     * 工厂的作用就是将零件装配，生产出成品汽车
     * 所以在此方法里书写汽车装配的逻辑
     * @return
     */
    @Override
    public ICar createCar() {
        // 实例化汽车零件
        Engine engine = new Engine();
        Underpan underpan = new Underpan();
        Wheel wheel = new Wheel();

        // 构造汽车
        ICar car = new Car(engine, underpan, wheel);

        return car;
    }
}
