package com.gxlm.springboot.controller.prop.configprop;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Description 类描述:
 * <br/>
 * 
 * @author 刘响林  E-mail: 1358554742@qq.com
 * @version 创建时间：2019年7月16日 下午5:03:52
 */
@Component
@ConfigurationProperties(prefix="user-info")
public class ConfigUserInfoProp {
    /**
     * 年龄
     */
    private Integer age;
    
    /**
     * 姓名
     */
    private String name;
    
    /**
     * 性别:男,女
     */
    private String sex;

    public Integer getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}