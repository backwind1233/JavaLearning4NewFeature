package com.DesignPatters.FilterChain;

/**
 * Created by zhihaoguo on 16/3/11.
 * zhihao.guo@dianping.com
 */
public class DebugFilter implements Filter {
    @Override
    public void exec() {
        System.out.println("debug filter");
    }
}
