package com.utils;


/**
 * Created by zhihaoguo on 16/2/19.
 * zhihao.guo@dianping.com
 * 奇特的一生,为的是写成timelogger
 */
public class GenerateTimeLog {
    public static void main(String[] args) {
        for (int i = 7 ; i < 24; i++) {
            System.out.println(i+":"+"00--"+i+":"+"15");
            System.out.println(i+":"+"15--"+i+":"+"30");
            System.out.println(i+":"+"30--"+i+":"+"45");
            System.out.println(i+":"+"45--"+(i+1)+":"+"00");
        }
    }
}
