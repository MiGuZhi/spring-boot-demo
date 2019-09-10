package com.gxlm.springboot.controller.prop.configprop;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Description 类描述:
 * <br/>
 * 
 * @author 刘响林  E-mail: 1358554742@qq.com
 * @version 创建时间：2019年7月16日 下午5:03:59
 */
@Component
@ConfigurationProperties(prefix="student")
public class ConfigStudentProp {
    /**
     * 班级名称
     */
    private String className;
    
    /**
     * 学号
     */
    private Long cno;
    
    /**
     * 用户基本信息
     */
    private ConfigUserInfoProp userInfo;

    public String getClassName() {
        return className;
    }

    public Long getCno() {
        return cno;
    }

    public ConfigUserInfoProp getUserInfo() {
        return userInfo;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public void setCno(Long cno) {
        this.cno = cno;
    }

    public void setUserInfo(ConfigUserInfoProp userInfo) {
        this.userInfo = userInfo;
    }
}