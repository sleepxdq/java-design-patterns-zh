# 中介者模式
---
### 定义
用一个中介对象封装一系列的对象交互，中介者使各对象不需要显示的相互作用，从而使其降低耦合，而且可以独立的改变他们之间的交互。
### 类图
![类图](https://upload.wikimedia.org/wikipedia/commons/e/e4/Mediator_design_pattern.png)
>Mediator是抽象中介类

定义统一接口，用来各同事类之间的交流
>ConcreteMediator 中介者具体类

用于协调各同事类之间的工作，所以要依赖同事类
>Colleague 抽象同事类

依赖中介抽象类
>ConcreteColleague1 & ConcreteColleague2具体同事类
用于实现自己的功能，不是自己的交给中介者来处理，也就不属于自己指责的交给中介者，然后依赖中介者

### 优点
减少类之间的依赖，将一对多转变成一对一
### 缺点
容易膨胀，同事类越多，中介者处理的业务也就越多
### 使用场景
如果发现类之间的依赖像蜘蛛网一样互相依赖就可以考虑使用中介者模式，使其依赖成为星型模式