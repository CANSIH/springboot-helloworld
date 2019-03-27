package com.bjsxt.springboothelloworld.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 功能：异常处理类
 *
 * @author hecg
 * @version 2018年12月26日 下午2:39:32
 */
@ControllerAdvice
public class MyControllerAdvice {

	@ResponseBody
	@ExceptionHandler(value = java.lang.Exception.class)
	public Map<String, Object> myException() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("code", 500);
		map.put("msg", "服务器悄悄溜走了，请稍后再试");
		return map;
	}

	@ResponseBody
	@ExceptionHandler(value = java.lang.NullPointerException.class)
	public Map<String, Object> myException2() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("code", -500);
		map.put("msg", "空指针异常了，请稍后再试");
		return map;
	}

	@ResponseBody
	@ExceptionHandler(value = com.bjsxt.springboothelloworld.exception.ApplicationException.class)
	public Map<String, Object> myException3(Exception ex) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("code", -800);
		map.put("msg", ex.getMessage());
		return map;
	}

}
