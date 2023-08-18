# 观察者模式

## UML类图
![observer](../../../../../resources/images/observer-uml.png)

## 定义
观察者模式，定义对象间**一对多**的依赖关系，使得当某一个对象改变状态，则所有依赖于它的对象都会得到通知并自动更新。

* 被观察者：存放多个观察者的容器Vector，注册观察者方法，删除观察者方法，通知观察者的方法。其中notifyObservers方法循环调用观察者自身的更新方法。
* 观察者：只有一个update方法，供被观察者的notifyObservers方法调用。
* 具体的被观察者：定义业务逻辑
* 具体的观察者：定义被观察者对象状态变化时的业务逻辑

## 示例
定义被观察者接口或抽象类（ISubject）和观察者接口（IObserver），具体的被观察者（WeatherData）和三个观察者（TemperatureBoard、HumidityBoard、PressureBoard）。
其中WeatherData里有自身的修改数据的方法，并调用notifyObserver方法通知观察者。观察者各自的update方法都有针对数据变化而进行的业务逻辑。

## 拓展
其实，JDK已经为我们封装好了观察者模式：
```java
import java.util.Observable;    // 被观察者类
import java.util.Observer;      // 观察者接口
```
具体代码可看：[java](java)

JDK封装的观察者模式有几个注意事项：
* 在调用`notifyObservers`方法进行通知前，必须`setChanged()`，改变状态值，才能正常的发出通知，同理，如果需要停止通知，只需`clearChanged()`即可。
* `notifyObservers`方法有两个重载，一个不带参数，代表着将被观察者本身传递给观察者，一个带参数`Object arg`，代表除被观察者自身外，可以传递任意一个Object对象给观察者。


