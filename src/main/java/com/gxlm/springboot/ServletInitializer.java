package com.gxlm.springboot;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * Description 类描述:
 * 
 * @author 刘响林  E-mail: 1358554742@qq.com
 * @version 创建时间：2018年11月27日 下午8:08:54
 */
public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SpringbootDemoApplication.class);
	}

}
