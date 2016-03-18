package com.thread;

import java.io.IOException;

/**
 * Created by zhihaoguo on 16/3/11.
 * zhihao.guo@dianping.com
 */
public class ThreadTest {
    private int i = 10;

    public static void main(String[] args) throws IOException {
        ThreadTest test = new ThreadTest();
        MyThread thread1 = test.new MyThread();
        MyThread thread2 = test.new MyThread();
        thread1.start();
        thread2.start();
    }


    class MyThread extends Thread {
        @Override
        public void run() {
            while (i < 100) {
                i++;
                System.out.println("线程" + Thread.currentThread().getName() + "=" + i);
            }
        }
    }
}
