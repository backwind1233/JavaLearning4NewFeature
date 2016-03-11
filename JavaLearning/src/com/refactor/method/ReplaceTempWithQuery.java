package com.refactor.method;

/**
 * Created by zhihaoguo on 16/2/20.
 * zhihao.guo@dianping.com
 */
public class ReplaceTempWithQuery {
    public static void main(String[] args) {

    }

    public static int add(int a, int b) {
        final int result = a + b;
        if (result > 1)
            System.out.println("bigger");
        else {
            System.out.println("smaller");
        }
        return 0;
    }


}
