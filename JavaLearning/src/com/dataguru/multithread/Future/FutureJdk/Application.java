package com.dataguru.multithread.Future.FutureJdk;

import java.util.concurrent.*;

/**
 * Created by zhihaoguo on 16/3/21.
 * zhihao.guo@dianping.com
 */
public class Application {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        FutureTask<String> futureTask = new FutureTask<String>(new RealData("name"));
        ExecutorService executor = Executors.newFixedThreadPool(1);
        //使用线程池来执行futureTask
        executor.submit(futureTask);

        //代表别的业务
        Thread.sleep(1000);
        System.out.println("数据="+futureTask.get());


    }
}
