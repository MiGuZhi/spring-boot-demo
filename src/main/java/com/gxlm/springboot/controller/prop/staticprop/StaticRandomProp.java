package com.gxlm.springboot.controller.prop.staticprop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Description 类描述:
 * <br/>
 * 
 * @author 刘响林  E-mail: 1358554742@qq.com
 * @version 创建时间：2019年7月16日 下午5:43:52
 */
@Component
public class StaticRandomProp {
    public static Integer num;
    
    public static Integer num1;
    
    public static String str;
    
    public static String uuid;

    @Value("${rand.num}")
    public void setNum(Integer num) {
        StaticRandomProp.num = num;
    }

    @Value("${rand.num1}")
    public void setNum1(Integer num1) {
        StaticRandomProp.num1 = num1;
    }

    @Value("${rand.str}")
    public void setStr(String str) {
        StaticRandomProp.str = str;
    }

    @Value("${rand.uuid}")
    public void setUuid(String uuid) {
        StaticRandomProp.uuid = uuid;
    }

    public Integer getNum() {
        return num;
    }

    public Integer getNum1() {
        return num1;
    }

    public String getStr() {
        return str;
    }

    public String getUuid() {
        return uuid;
    }
}