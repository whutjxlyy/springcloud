package com.liujixiao.spring.springcloud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

	@RequestMapping("/service/v1/index")
	String index(){
		return "{\"result\":\"Hello world!\"}";
	}
}
