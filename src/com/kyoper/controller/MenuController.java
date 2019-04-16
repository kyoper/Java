package com.kyoper.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kyoper.Service.MenuService;
import com.kyoper.pojo.Menu;

@Controller
public class MenuController {
	/*springmvc容器调用spring容器中内容*/
	@Resource
	private MenuService menuServiceImpl;
	
	@RequestMapping("show")
	/*将结果转换为JSON对象以流的方式输出*/
	@ResponseBody
	public List<Menu> show() throws Exception{  
		return menuServiceImpl.show();
	}
}
