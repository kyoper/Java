package com.kyoper.mapper;

import java.util.List;

import com.kyoper.pojo.Menu;

public interface menuMapper {
	List<Menu> selByPid(int pid);
}
