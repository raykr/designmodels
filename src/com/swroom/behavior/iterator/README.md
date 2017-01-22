# 迭代器模式

## UML类图
![iterator](../../../../../resources/images/iterator.png)

## 定义
迭代器模式可以说是Java中最常用的模式了，看如下代码：
```java
public static void print(Collection coll){  
    Iterator it = coll.iterator();  
    while(it.hasNext()){  
        String str = (String)it.next();  
        System.out.println(str);  
    }  
}
```
Java语言已经完整的实现了迭代器模式，迭代器是与集合相关的，迭代器的作用就是把容器中的对象一个一个遍历出来。

## 结构
* **抽象容器**：一般是接口，提供`iterator()`方法。例如`Collection`接口，`List`接口，`Set`接口等。
* **具体容器**：抽象容器的实现类。例如List接口的有序列表实现`ArrayList`，链表实现`LinkList`，Set接口的哈希列表实现`HashSet`等
* **抽象迭代器**：用于定义遍历所有元素所需要的方法，一般来说有
    * 取得第一个元素的方法：`first()`
    * 取得下一个元素的方法：`next()`
    * 判断是否遍历结束的方法：`isDone()`或`hasNext()`
    * 移出当前对象的方法：`remove()`
* **迭代器实现**：实现迭代器接口中的方法，完成集合迭代。

## JDK中的迭代器
`java.lang.Iterable`和`java.util.Iterator`

## 优缺点
* 简化遍历模式，让对象自遍历。
* 可提供多种遍历方式，例如正序遍历和反序遍历。
* 封装性良好，不用关心遍历算法。
* 对于简单的遍历使用迭代器感觉比较繁琐。

## 适用场景
由于迭代器和集合一般来说都会配合的出现，当JDK提供给我们的集合都自带响应的迭代器，并已经满足我们绝大部分需求，所以只需要会使用JDK提供的容器和迭代器即可。