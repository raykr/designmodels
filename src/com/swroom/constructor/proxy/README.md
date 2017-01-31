# 代理模式

## 定义
代理模式(Proxy Pattern)是一个使用率非常高的模式。为其他对象提供一种代理以控制对这个对象的访问。

* Subject抽象主题角色（IGamePlayer）
* RealSubject 具体主题角色（GamePlayer）
* Proxy 代理主题角色（GamePlayIH）

## 优点
* 职责清晰
* 高扩展性
* 智能化

## 动态代理
动态代理是在实现阶段不用关心代理谁，而在运行阶段才指定代理那一个对象。

面向横切面编程，也就是AOP（Aspect Oriented Programming），其核心就是采用了动态代理机制。

