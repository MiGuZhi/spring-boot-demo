package com.gxlm.springboot.controller.prop.valueprop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Description 类描述:
 * <br/>
 * 
 * @author 刘响林  E-mail: 1358554742@qq.com
 * @version 创建时间：2019年7月16日 下午5:38:37
 */
@Component
public class RandomValueProp {
    @Value("${rand.num}")
    private Integer num;
    
    @Value("${rand.num1}")
    private Integer num1;
    
    @Value("${rand.str}")
    private String str;
    
    @Value("${rand.uuid}")
    private String uuid;

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

    public void setNum(Integer num) {
        this.num = num;
    }

    public void setNum1(Integer num1) {
        this.num1 = num1;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
}