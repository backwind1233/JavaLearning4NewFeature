package com.dataguru.multithread.Future.FutureJdk;

import java.util.concurrent.Callable;

/**
 * Created by zhihaoguo on 16/3/21.
 * zhihao.guo@dianping.com
 */
public class RealData implements Callable {
    protected String data;

    public RealData(String data) {
        this.data = data;
    }

    @Override
    public Object call() throws Exception {
        try {
            System.out.println(Thread.currentThread().getName());
            Thread.sleep(1000);
            data = "heheda"+data;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return data;
    }
}
