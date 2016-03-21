package com.dataguru.multithread.Future;

/**
 * Created by zhihaoguo on 16/3/21.
 * zhihao.guo@dianping.com
 * future模式的本质就是两个线程,通过wait和notifyAll来同步
 */
public class Application {
    public static void main(String[] args) throws InterruptedException {
        Client client = new Client();
        //这里会立即返回，因为获取的是FutureData，而非RealData
        System.out.println("Thread的线程是---"+Thread.currentThread().getName());
        System.out.println("--------------------------------");
        long begintime = System.currentTimeMillis();
        Data data = client.request("name");
        //这里可以用一个sleep代替对其他业务逻辑的处理
        //在处理这些业务逻辑过程中，RealData也正在创建，从而充分了利用等待时间
        //使用真实数据
        System.out.println("数据="+data.getResult());
        long endtime = System.currentTimeMillis();
        System.out.println(endtime-begintime);
    }

}
