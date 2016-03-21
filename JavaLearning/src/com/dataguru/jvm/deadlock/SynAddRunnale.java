package com.dataguru.jvm.deadlock;

/**
 * Created by zhihaoguo on 16/3/21.
 * zhihao.guo@dianping.com
 */
public class SynAddRunnale implements Runnable {
    int a ,b ;

    public SynAddRunnale(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void run() {
        synchronized (Integer.valueOf(a)) {
            synchronized (Integer.valueOf(b)) {
                System.out.println(a+b);
            }
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(new SynAddRunnale(1,2)).start();
            new Thread(new SynAddRunnale(2,1)).start();
        }
    }
}
