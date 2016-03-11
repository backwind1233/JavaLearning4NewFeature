package com.thread.ThreadLocal;

/**
 * Created by zhihaoguo on 16/3/11.
 * zhihao.guo@dianping.com
 */
public class Test {
    public static void main(String[] args) {
        ThreadLocalTest testThread1 = new ThreadLocalTest();
        ThreadLocalTest testThread2 = new ThreadLocalTest();
        ThreadLocalTest testThread3 = new ThreadLocalTest();
        testThread1.start();
        testThread2.start();
        testThread3.start();

    }
}
