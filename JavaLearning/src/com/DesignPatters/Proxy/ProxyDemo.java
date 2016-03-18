package com.DesignPatters.Proxy;

import java.lang.reflect.Proxy;

/**
 * Created by zhihaoguo on 16/3/17.
 * zhihao.guo@dianping.com
 */
public class ProxyDemo {
    public static void main(String[] args) {
        //默认的动态代理的实现
        //基于java自带的代理机制实现的是基于Interface接口来实现的
        UserHandler userHandler = new UserHandler(new User());
        IUser proxyUser = (IUser) Proxy.newProxyInstance(ProxyDemo.class.getClassLoader(),new Class[]{IUser.class},userHandler);
        proxyUser.sayHello();
        //java 内部的动态代理是基于"组合"来实现的
    }
        //java开发中有一条原则,多用组合,少用继承,还记得HEAD FIRST中的鸭子么,会飞的鸭子和会叫的鸭子,这两个行为就是基于组合来的
}
