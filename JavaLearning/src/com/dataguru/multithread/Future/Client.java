package com.dataguru.multithread.Future;

/**
 * Created by zhihaoguo on 16/3/21.
 * zhihao.guo@dianping.com
 */
public class Client {
    public Data request(final String string){
        final FutureData futureData = new FutureData();

        new Thread(new Runnable() {
            @Override
            public void run() {
                //RealData的构建很慢，所以放在单独的线程中运行
                RealData realData = new RealData(string);
                futureData.setRealData(realData);
            }
        }).start();

        return futureData; //先直接返回FutureData
    }
}
