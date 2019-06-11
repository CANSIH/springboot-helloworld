package com.hecg.springboothelloworld.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContextException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hecg.springboothelloworld.exception.ApplicationException;

@RestController
public class HelloWorldController {

	@Value("${msg}")
	private String msg;

	@RequestMapping("/hello")
	public String showMsg() {
		//int i = 1 / 0;
		/*String s = null;
		s.length();*/
		// throw new ApplicationException("服务器溜走了，请稍后再试");
		return this.msg;
	}

}
