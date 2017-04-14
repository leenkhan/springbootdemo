package com.github.lk.springbootdemo.controller;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.github.lk.springbootdemo.dao.TestDao;

@RestController
@RequestMapping("/home")
public class IndexController {
	@Autowired
	private TestDao dao;
	
	@RequestMapping("/index")
	@ResponseBody
	public List<Map<String,Object>> home(){
		List<Map<String,Object>> list = dao.find();
		return list;
	}
}
