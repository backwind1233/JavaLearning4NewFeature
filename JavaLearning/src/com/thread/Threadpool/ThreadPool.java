package com.thread.Threadpool;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by zhihaoguo on 16/3/21.
 * zhihao.guo@dianping.com
 * 线程池的简单实现,在同步上会有一些问题
 * 说明多线程的问题还是很值得研究的
 */
public final class ThreadPool {

    private static int worker_num = 5;
    private WorkThread[] workThrads;

    private static volatile int finished_task = 0;

    private List<Runnable> taskQueue = new LinkedList<Runnable>();

    private static ThreadPool threadPool;

    private ThreadPool(){
        this(5);
    }


    private ThreadPool(int worker_num) {
        ThreadPool.worker_num = worker_num;
        workThrads = new WorkThread[worker_num];
        for (int i = 0; i < worker_num; i++) {
            workThrads[i] = new WorkThread();
            workThrads[i].start();
        }
    }

    public static ThreadPool getThreadPool() {
        return getThreadPool(ThreadPool.worker_num);
    }

    public static ThreadPool getThreadPool(int worker_num) {
        if (worker_num <= 0) {
            worker_num = ThreadPool.worker_num;
        }
        if (threadPool == null) {
            threadPool = new ThreadPool(worker_num);
        }
        return threadPool;
    }

    public void execute(Runnable task) {
        synchronized (taskQueue) {
            taskQueue.add(task);
            taskQueue.notify();
        }
    }

    public void execute(Runnable[] task) {
        synchronized (taskQueue) {
            for (Runnable runnable : task) {
                taskQueue.add(runnable);
            }
            taskQueue.notify();
        }
    }

    public void execute(List<Runnable> task) {
        synchronized (taskQueue) {
            for (Runnable t : task) {
                taskQueue.add(t);
            }
            taskQueue.notify();
        }
    }


    public void destory() {
        while (!taskQueue.isEmpty()) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


        for (int i = 0; i < worker_num; i++) {
            workThrads[i].stopWorker();
            workThrads[i].stop();
            workThrads[i] = null;
        }
        threadPool=null;
        System.out.println("threadpool = null");
        taskQueue.clear();
    }

    public int getWorkThreadNumber() {
        return worker_num;
    }

    public int getFinishedTasknumber() {
        return finished_task;
    }

    public int getWaitTasknumber() {
        return taskQueue.size();
    }

    @Override
    public String toString() {
        return "WorkThread number"+worker_num+" finished task number:"+
                finished_task+" wait task number:"+getWaitTasknumber();
    }


    private class WorkThread extends Thread {
        private boolean isRunning = true;

        @Override
        public void run() {
            Runnable r = null;
            System.out.println("Thread "+Thread.currentThread().getName()+" 开始start()");
            while (isRunning) {
                synchronized (taskQueue){
                    while (isRunning && taskQueue.isEmpty()) try {
                        taskQueue.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    if (!taskQueue.isEmpty()) {
                        r = taskQueue.remove(0);
                    }
                }
                if (r != null) {
                    r.run();
                }

                finished_task++;
                r =null;
            }
        }

        public void stopWorker() {
            isRunning =false;
            System.out.println("current ThreadName="+Thread.currentThread().getName());
        }
    }

}
