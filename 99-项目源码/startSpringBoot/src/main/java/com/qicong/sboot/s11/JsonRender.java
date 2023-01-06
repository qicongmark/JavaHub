package com.qicong.sboot.s11;

import com.alibaba.fastjson.JSONObject;

/**
 * User: 祁大聪
 */
public class JsonRender {

    public static final Integer SUCCESS = 0;
    public static final Integer FAILURE = 1;

    public static String success(Object data){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("errcode",SUCCESS);
        jsonObject.put("data",data);
        return jsonObject.toJSONString();
    }

    public static String failure(String message){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("errcode",FAILURE);
        jsonObject.put("message",message);
        return jsonObject.toJSONString();
    }
}
