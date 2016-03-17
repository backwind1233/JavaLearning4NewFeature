package com.DesignPatters.FilterChain;

/**
 * Created by zhihaoguo on 16/3/11.
 * zhihao.guo@dianping.com
 */
public class FilterChainDemo {
    public static void main(String[] args) {

        FilterManager filterManager = new FilterManager(new Target());
        FilterChain filterChain = new FilterChain();
        filterManager.setFilterChain(filterChain);
        filterChain.setFilter(new AuthenFilter());
        filterChain.setFilter(new DebugFilter());

        filterManager.exec();
        //这是一个失败的模式
        //应该只暴露filtermanager一个类在外面
        //filtermanager处理请求的时候
    }
}
