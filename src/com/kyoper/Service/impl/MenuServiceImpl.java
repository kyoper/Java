package com.kyoper.Service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.springframework.stereotype.Service;

import com.kyoper.Service.MenuService;
import com.kyoper.mapper.menuMapper;
import com.kyoper.pojo.Menu;
@Service
public class MenuServiceImpl implements MenuService{
	@Resource
	private menuMapper menuMapper;
	@Test
	@Override
	public List<Menu> show() {

		return menuMapper.selByPid(0);
	}

}
