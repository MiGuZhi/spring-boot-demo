package com.gxlm.springboot.controller.prop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gxlm.springboot.controller.prop.configprop.ConfigRandomProp;
import com.gxlm.springboot.controller.prop.configprop.ConfigStudentProp;
import com.gxlm.springboot.controller.prop.configprop.ConfigUserInfoProp;
import com.gxlm.springboot.controller.prop.staticprop.StaticRandomProp;
import com.gxlm.springboot.controller.prop.valueprop.RandomValueProp;
import com.gxlm.springboot.controller.prop.valueprop.StudentValueProp;
import com.gxlm.springboot.controller.prop.valueprop.UserInfoValueProp;

/**
 * Description 类描述:
 * <br/>属性读取
 * 
 * @author 刘响林  E-mail: 1358554742@qq.com
 * @version 创建时间：2019年7月16日 下午5:02:43
 */
@RestController
//@Scope("prototype")
public class PropController {
    @Autowired
    private RandomValueProp randomValueProp;
    @Autowired
    private StudentValueProp studentValueProp;
    @Autowired
    private UserInfoValueProp userInfoValueProp;
    @Autowired
    private ConfigRandomProp configRandomProp;
    @Autowired
    private ConfigStudentProp configStudentProp;
    @Autowired
    private ConfigUserInfoProp configUserInfoProp;
    @Autowired
    private StaticRandomProp staticRandomProp;
    
    @RequestMapping(value = "value/random", method = RequestMethod.GET)
    public RandomValueProp getRandomValueProp() {
        return randomValueProp;
    }
    
    @RequestMapping(value = "value/student", method = RequestMethod.GET)
    public StudentValueProp getStudentValueProp() {
        return studentValueProp;
    }
    
    @RequestMapping(value = "value/userInfo", method = RequestMethod.GET)
    public UserInfoValueProp getUserInfoValueProp() {
        return userInfoValueProp;
    }
    
    @RequestMapping(value = "config/random", method = RequestMethod.GET)
    public ConfigRandomProp getConfigRandomProp() {
        return configRandomProp;
    }
    
    @RequestMapping(value = "config/student", method = RequestMethod.GET)
    public ConfigStudentProp getConfigStudentProp() {
        return configStudentProp;
    }
    
    @RequestMapping(value = "config/userInfo", method = RequestMethod.GET)
    public ConfigUserInfoProp getConfigUserInfoProp() {
        return configUserInfoProp;
    }
    
    @RequestMapping(value = "static/random", method = RequestMethod.GET)
    public StaticRandomProp getStaticRandomProp() {
        return staticRandomProp;
    }
}