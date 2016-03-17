package com.thread.ThreadLocal;

/**
 * Created by zhihaoguo on 16/3/11.
 * zhihao.guo@dianping.com
 */
public class Counter {
    //在每一个Thread内部都有一个ThreadLocalMap的副本
    //获得当前Thread的ThreadLocalMap的对象,以ThreadLocal变量为key的map

    //threadlocal对象获取的实际是Thread中的对象的副本
    private static ThreadLocal<Integer> counterContext = new ThreadLocal<Integer>(){
        @Override
        protected Integer initialValue() {
            return 10;
        }
    };

    public static Integer get(){
        return counterContext.get();
    }

    public static void set(Integer value){
        counterContext.set(value);
    }

    public static Integer getNextCounter(){
        counterContext.set(counterContext.get() + 1);
        return counterContext.get();
    }

    private static ThreadLocal<Integer> counterContext2 = new ThreadLocal<Integer>(){
        @Override
        protected Integer initialValue() {
            return 100;
        }
    };
    public static Integer get2(){
        return counterContext2.get();
    }

    public static void set2(Integer value){
        counterContext2.set(value);
    }

    public static Integer getNextCounter2(){
        counterContext2.set(counterContext2.get() + 1);
        return counterContext2.get();
    }





}
