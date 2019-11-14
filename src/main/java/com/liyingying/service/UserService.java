package com.liyingying.service;

import com.github.pagehelper.PageInfo;
import com.liyingying.bean.User;

public interface UserService {

	PageInfo<User> getPageList(String name, Integer page);
	/**
	 * 
	 * @Title: getUserById 
	 * @Description: 根据id获取用户信息
	 * @param userId
	 * @return
	 * @return: User
	 */
	User getUserById(Integer userId);
	/**
	 * 
	 * @Title: updateStatus 
	 * @Description: 修改用户状态  解禁和封禁
	 * @param userId
	 * @param status
	 * @return
	 * @return: int
	 */
	int updateStatus(Integer userId, int status);

}
