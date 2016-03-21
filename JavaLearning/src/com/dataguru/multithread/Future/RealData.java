package com.dataguru.multithread.Future;

/**
 * Created by zhihaoguo on 16/3/21.
 * zhihao.guo@dianping.com
 */
public class RealData implements Data {
    protected String data;

    public RealData(String data) {
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.data = data;
    }

    @Override
    public String getResult() throws InterruptedException {
        return data;
    }
}
