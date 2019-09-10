package com.gxlm.springboot.controller.prop.valueprop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Description 类描述:
 * <br/>
 * 
 * @author 刘响林  E-mail: 1358554742@qq.com
 * @version 创建时间：2019年7月16日 下午5:03:59
 */
@Component
public class StudentValueProp {
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
    private UserInfoValueProp userInfo;

    /**
     * @Value写在getter方法上,将没法注入到成员变量上
     * 
     * @author 刘响林
     * @version 日期:2019年7月16日
     * @return
     */
    @Value("${student.className}")
    public String getClassName() {
        return className;
    }

    @Value("${student.cno}")
    public Long getCno() {
        return cno;
    }

//    @Value("${student.userInfo}")
    public UserInfoValueProp getUserInfo() {
        return userInfo;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public void setCno(Long cno) {
        this.cno = cno;
    }

    /**
     * 不能通过@Value注解注入对象属性
     * 
     * @author 刘响林
     * @version 日期:2019年7月16日
     * @param userInfo
     */
//    @Value("${student.userInfo}")
    public void setUserInfo(UserInfoValueProp userInfo) {
        this.userInfo = userInfo;
    }
}