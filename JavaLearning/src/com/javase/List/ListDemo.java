package com.javase.List;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhihaoguo on 16/3/18.
 * zhihao.guo@dianping.com
 */
//参考地址http://www.blogjava.net/yourfriend/articles/377755.html
public class ListDemo {
    public static void main(String[] args) {
        List list_a = new ArrayList();
        List list_b = new ArrayList();
        list_a.add(111);
        list_a.add(222);
        list_a.add(333);

        list_b.add(222);
        list_b.add(333);
        list_b.add(444);

        System.out.println(list_a);
        System.out.println(list_b);

        //并
        List combine = new ArrayList(list_a);
        System.out.println(combine);
        combine.addAll(list_b);
        System.out.println(combine);

        //交
        List cross =new ArrayList(list_a);
        cross.retainAll(list_b);
        System.out.println(cross);

        //差
        List diff =new ArrayList(list_a);
        cross.removeAll(list_b);
        System.out.println(diff);

        //无重复并集
        List combinewithoutduplicate =new ArrayList(list_a);
        List list_b_clone = new ArrayList(list_b);
        list_b_clone.removeAll(combinewithoutduplicate);
        combinewithoutduplicate.addAll(list_b_clone);
        System.out.println(combinewithoutduplicate);


    }
}
