package com.thoughtworks.basic;

import com.sun.deploy.util.StringUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Schema {
    public String[] splitString(String string)throws Exception{
        Pattern p = Pattern.compile("-\\s+|-\\S\\S|-\\S-");
        Matcher m = p.matcher(string);
        if(m.find()){
            throw new Exception("非法字符");
        }

        String[] str = string.split("-");
        return str;
    }
    public Map<String, Object> transToMap(String[] str)throws Exception{
        Map<String,Object> map = new HashMap<>();
        for (int i=0;i<str.length;i++){
            String[] tempStr = str[i].trim().split(" ");
                if(!"".equals(tempStr[0])){
                    if(!map.containsKey(tempStr[0])){
                        map.put(tempStr[0],tempStr[1]);
                    }else{
                        throw new Exception("输入字符串重复："+tempStr[0]);
                    }
                }
        }
        return map;
    }

    public Map<String, Object> verify(Map<String,Object> map)throws Exception{
        if (map.containsKey("l")){
            String key = (String) map.get("l");
            if(!(key.matches("true|false"))){
                throw new Exception("参数l的value类型不是布尔");
            }
        }else {
            map.put("l",false);
        }
        if (map.containsKey("p")){
            String key = (String) map.get("p");
            if(!(key.matches("[0-9]+"))){
                throw new Exception("参数p的value类型不是整型");
            }
        }else {
            map.put("p",0);
        }
        if (map.containsKey("d")){
            if(!(map.get("d") instanceof String)){
                throw new Exception("参数d的value类型不是字符型");
            }
        }else {
            map.put("d","");
        }
        return map;
    }
}
