package com.utils;


/**
 * Created by zhihaoguo on 16/2/19.
 * zhihao.guo@dianping.com
 * 奇特的一生,为的是写成timelogger
 * test
 */
public class GenerateTimeLog {
    public static void main(String[] args) {
        generateTimelog(7, 24);
    }

    private static void generateTimelog(int start, int end) {
        for (int i = start ; i < end; i++) {
            String suffix[]= getSuffixString();
            String prefix = i+"";
            String prefix_to  = (i+1)+"";
            System.out.println(prefix+":"+"00--"+prefix+":"+"15");
            System.out.println(i+":"+"15--"+i+":"+"30");
            System.out.println(i+":"+"30--"+i+":"+"45");
            System.out.println(i+":"+"45--"+(i+1)+":"+"00");
        }
    }

    private static String[] getSuffixString() {
        return new String[]{"00","15","30","45","00"};
    }
}
