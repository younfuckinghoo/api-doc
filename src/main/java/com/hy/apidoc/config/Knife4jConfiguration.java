package com.hy.apidoc.config;

/*
 * Copyright (C) 2018 Zhejiang xiaominfo Technology CO.,LTD.
 * All rights reserved.
 * Official Web Site: http://www.xiaominfo.com.
 * Developer Web Site: http://open.xiaominfo.com.
 */


import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springdoc.core.customizers.GlobalOpenApiCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

/***
 * 创建Swagger配置
 * @since:knife4j-springdoc-openapi-demo 1.0
 * @author <a href="mailto:xiaoymin@foxmail.com">xiaoymin@foxmail.com</a>
 * 2020/03/15 20:40
 */
@Configuration
public class Knife4jConfiguration{
	/**
	 * 根据@Tag 上的排序，写入x-order
	 *
	 * @return the global open api customizer
	 */
	@Bean
	public GlobalOpenApiCustomizer orderGlobalOpenApiCustomizer() {
		return openApi -> {
			if (openApi.getTags()!=null){
				openApi.getTags().forEach(tag -> {
					Map<String,Object> map=new HashMap<>();
					map.put("x-order", 1);
					tag.setExtensions(map);
				});
			}
			if(openApi.getPaths()!=null){
				openApi.addExtension("x-test123","333");
				openApi.getPaths().addExtension("x-abb",1);
			}

		};
	}

	@Bean
	public OpenAPI customOpenAPI() {
		return new OpenAPI()
				.info(new Info()
						.title("董矿智慧调度算法API")
						.version("1.0")

						.description( "Knife4j集成springdoc-openapi示例")
						.termsOfService("http://doc.xiaominfo.com")
						.license(new License().name("Apache 2.0")
								.url("http://doc.xiaominfo.com")));
	}


}
