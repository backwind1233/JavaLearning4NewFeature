package com.thread.ThreadLocal;

/**
 * Created by zhihaoguo on 16/3/11.
 * zhihao.guo@dianping.com
 */
public class ThreadLocalTest extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread" + Thread.currentThread().getName()+"],counter="+Counter.getNextCounter());
            System.out.println("Thread2" + Thread.currentThread().getName()+"],counter2="+Counter.getNextCounter2());
        }
    }
}
