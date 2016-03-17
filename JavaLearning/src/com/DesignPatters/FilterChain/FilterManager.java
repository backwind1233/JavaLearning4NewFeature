package com.DesignPatters.FilterChain;

/**
 * Created by zhihaoguo on 16/3/11.
 * zhihao.guo@dianping.com
 */
public class FilterManager {
    private Target target;

    private FilterChain filterChain;

    public void setFilterChain(FilterChain filterChain) {
        this.filterChain = filterChain;
    }

    public FilterManager(Target target) {
        this.target = target;
    }

    public void exec(){
        filterChain.setTarget(target);
        filterChain.execute();
    }

}
