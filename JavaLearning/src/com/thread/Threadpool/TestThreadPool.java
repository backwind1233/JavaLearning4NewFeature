package com.thread.Threadpool;


/**
 * Created by zhihaoguo on 16/3/21.
 * zhihao.guo@dianping.com
 */
public class TestThreadPool {
    public static void main(String[] args) {
        ThreadPool t= ThreadPool.getThreadPool(3);
        System.out.println(t);
        t.execute(new Runnable[]{new Task(),new Task(),new Task(),new Task()});
        System.out.println(t);
        t.execute(new Runnable[]{new Task(),new Task(),new Task()});
        System.out.println(t);
        t.destory();
        System.out.println(t);
        System.out.println("good buy");
    }

    static class Task implements Runnable {
        private static  volatile  int i =1;
        @Override
        public void run() {
            System.out.println("任务"+(i++) +" 完成");
        }
    }

}
