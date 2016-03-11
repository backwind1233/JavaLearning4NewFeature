package com.refactor;

/**
 * Created by zhihaoguo on 16/2/20.
 * zhihao.guo@dianping.com
 */
public class FinalParameterTest {
    public static void main(String[] args) {

    }

    public static int add(final int a,final int b){
        // 明在方法中,final不一定是要立刻初始化的
        final int temp;
        temp = a+b;
        return temp;
    }
}
