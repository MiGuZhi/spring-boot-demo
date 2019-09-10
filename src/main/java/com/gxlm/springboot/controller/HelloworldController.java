package com.gxlm.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description 类描述:
 * <br/>SpringBoot -Hello World
 * 
 * @author 刘响林  E-mail: 1358554742@qq.com
 * @version 创建时间：2018年11月26日 下午5:58:58
 */
@RestController
public class HelloworldController {
	
	@RequestMapping(value = "/",method = RequestMethod.GET)
	public String helloworld() {
		return "Hello World";
	}
	
	@RequestMapping(value = "/chinese",method = RequestMethod.GET)
	public String chinese() {
		return "你好,SpringBoot";
	}

}

