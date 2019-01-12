package com.bobo.common.uitl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Map;

/**
 * json相关
 * @author wuxiaobo@didachuxing.com
 * @create 2019-01-12 11:06
 **/
public class JsonMapper {

    private static Logger logger = LoggerFactory.getLogger(JsonMapper.class);

    public static String toJson(Object obj) {

        String jsonStr = "";
        try {
            jsonStr = JSON.toJSONString(obj);
        } catch (Exception e) {
            logger.error("toJson failed.", e);
        }
        return jsonStr;
    }

    public static <T> T json2Bean(String jsonString, Class<T> cls) {
        T t = null;
        try {
            t = JSON.parseObject(jsonString, cls);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("json2Bean failed." + jsonString, e);
        }
        return t;
    }

    public static <T> List<T> json2List(String jsonString, Class<T> cls) {
        List<T> list = null;
        try {
            list = JSON.parseArray(jsonString, cls);
        } catch (Exception e) {
            logger.error("json2List failed." + jsonString, e);
        }
        return list;
    }

    public static Map<String, Object> json2Map(String jsonString) {
        Map<String, Object> map = null;
        try {
            map = JSON.parseObject(jsonString, new TypeReference<Map<String, Object>>() {
            });
        } catch (Exception e) {
            logger.error("json2Map failed." + jsonString, e);
        }
        return map;
    }
}
