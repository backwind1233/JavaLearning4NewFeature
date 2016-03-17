package com.DesignPatters.Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by zhihaoguo on 16/3/17.
 * zhihao.guo@dianping.com
 */
public class UserHandler implements InvocationHandler {
    Object target;

    public UserHandler(Object target) {
        this.target = target;
    }

    public void beforeSayHello(){
        System.out.println("say hello with proxy");
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        beforeSayHello();
        method.invoke(target,args);
        return null;
    }
}
