package com.sust.java.chapter4.demo5;

/**
 * Tiger继承了父类Animal
 * @author sunqiang
 */
public class Tiger extends Animal {

    @Override
    public void eat() {
        //调用父类的被覆盖的eat()方法
        super.eat();
        //调用父类的属性
        System.out.println("调用父类的属性：" + super.type);
        System.out.println("我喜欢吃Rabbit---");
    }
}
