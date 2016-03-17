package com.DesignPatters.Proxy;

/**
 * Created by zhihaoguo on 16/3/17.
 * zhihao.guo@dianping.com
 */
public class User implements IUser {
    @Override
    public void sayHello() {
        System.out.println("Hello,I am a user");
    }
}
