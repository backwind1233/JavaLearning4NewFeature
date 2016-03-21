package com.dataguru.multithread.Future;

/**
 * Created by zhihaoguo on 16/3/21.
 * zhihao.guo@dianping.com
 */
public class FutureData implements Data {
    RealData realData = null; //FutureData是RealData的封装
    boolean isReady = false;  //是否已经准备好

    public synchronized void setRealData(RealData realData) {
        if(isReady)
            return;
        this.realData = realData;
        isReady = true;
        System.out.println("Thread的线程是---setRealData"+Thread.currentThread().getName());
        System.out.println("begin notifyAll");
        notifyAll(); //RealData已经被注入到FutureData中了，通知getResult()方法
    }

    @Override
    public synchronized String getResult() throws InterruptedException {
        if (!isReady){
            wait();
        }
        System.out.println("Thread的线程是---getResult"+Thread.currentThread().getName());
        return realData.getResult();
    }
}
