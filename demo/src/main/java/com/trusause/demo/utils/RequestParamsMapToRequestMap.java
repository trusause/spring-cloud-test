package com.trusause.demo.utils;

import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@Slf4j
@Component
public class RequestParamsMapToRequestMap {


    private static RequestParamsMapToRequestMap requestParamsMapToRequestMap;

    @PostConstruct
    public void init() {
        requestParamsMapToRequestMap = this;
    }

    //返回值类型为Map<String, Object>
    public static Map<String, Object> getParameterMapCommon(Map<String, String[]> properties) {

        Map<String, Object> returnMap = new HashMap<String, Object>();
        Iterator<Map.Entry<String, String[]>> iter = properties.entrySet().iterator();

        while (iter.hasNext()) {
            String name = "";
            String value = "";
            Map.Entry<String, String[]> entry = iter.next();
            name = entry.getKey();
            Object valueObj = entry.getValue();
            if (null == valueObj) {
                value = "";
            } else if (valueObj instanceof String[]) {
                String[] values = (String[]) valueObj;
                for (int i = 0; i < values.length; i++) { //用于请求参数中有多个相同名称
                    value += values[i] + ",";
                }
                value = value.substring(0, value.length() - 1);
            } else {
                value = valueObj.toString();//用于请求参数中请求参数名唯一
            }
            returnMap.put(name, value);
        }

        return returnMap;
    }

}
