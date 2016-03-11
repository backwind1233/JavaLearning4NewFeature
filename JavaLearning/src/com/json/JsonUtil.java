package com.json;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

/**
 * Created by zhihaoguo on 16/3/8.
 * zhihao.guo@dianping.com
 */
public class JsonUtil {
    public static void main(String[] args) {
        String json = "{\"a\":443434,\"b\":2}";
        Object a = JSONObject.parseObject(json).get("a");
        Object b = JSONObject.parseObject(json).get("b");
        System.out.println(a);
        System.out.println(b);


        String[] arr_String    = {"a","b","c"};
        String json_arr_String = JSON.toJSONString(arr_String,true);
        System.out.println(json_arr_String);
        JSONArray jsonArray = JSON.parseArray(json_arr_String);
        for (Object o : jsonArray) {
            System.out.println(o);
        }
        System.out.println(jsonArray);

    }

}
