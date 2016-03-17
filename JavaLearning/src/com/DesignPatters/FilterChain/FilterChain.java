package com.DesignPatters.FilterChain;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhihaoguo on 16/3/11.
 * zhihao.guo@dianping.com
 */
public class FilterChain {
    Target target;


    public void setTarget(Target target) {
        this.target = target;
    }

    private List<Filter> filterList = new ArrayList<Filter>();
    public void setFilter(Filter filter){
        filterList.add(filter);
    }

    public void execute(){
        for (Filter filter : filterList) {
            filter.exec();
        }
        target.exec();
    }


}
